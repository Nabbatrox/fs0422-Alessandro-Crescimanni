import { Injectable } from '@angular/core';
import { Todo } from './todo';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  constructor() { }

  todosUrlPath:string = 'http://localhost:3000/todos'

  todos:Todo[] = []

  getAllTodos():Promise<Todo[]>{
     return new Promise<Todo[]>((resolve, reject) => {
        setTimeout(() =>{
          let call = fetch(this.todosUrlPath).then(res => res.json())
          resolve(call)
        },2000)
    })

  }
}
