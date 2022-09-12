import { Injectable } from '@angular/core';
import { Todo } from './todo';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  constructor() { }

  todosUrlPath:string = 'http://localhost:3000/todos'

  

  getAllTodos():Promise<Todo[]>{
     return new Promise<Todo[]>((resolve, reject) => {
        setTimeout(() =>{
          let call = fetch(this.todosUrlPath).then(res => res.json())
          resolve(call)
        },2000)
    })

  }

  // .then(res => { res.filter(Boolean)

  // passo in ingresso il parametro e creo un nuovo oggetto Todo da inserire con metodo POST dentro il db.json e lo visualizzo successivamente nel DOM
  createTodo(todo:Todo):Promise<Todo[]> {
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        let todoObj = Object.assign({}, todo);

        let option = {
          method: 'POST',
          body: JSON.stringify(todoObj),
          headers: {
            'content-type': 'application/json',
          },
        };
        resolve(fetch('http://localhost:3000/todos', option).then(res => res.json()))
      },2000)
    })
  }

  // credo il metodo delTodo che fa passare in ingresso l'id specifico dell'oggetto da eliminare

  delTodo(id:number| undefined):Promise<Todo[]> {
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        let option = {
          method: 'DELETE',
          headers: {
            'content-type': 'application/json',
          },
        };

        resolve(fetch('http://localhost:3000/todos/'+id, option).then(res => res.json()))
      },2000)
    })
  }

  // faccio passare in ingresso l'id e il parametreo dell'oggetto da modificare con PATCH

  updateTodo(id:number| undefined, todo:Todo ):Promise<Todo>{
    return new Promise((resolve, reject) => {
      setTimeout(() =>{
        let option = {
          method: 'PATCH',
          body: JSON.stringify(todo),
          headers: {
            'content-type': 'application/json',
          },
        };

        resolve(fetch('http://localhost:3000/todos/'+id, option).then(res => res.json()))
      },2000)
    })
  }


}
