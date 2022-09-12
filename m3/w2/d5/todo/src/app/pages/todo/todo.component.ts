import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/todo';
import { TodosService } from 'src/app/todos.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {

  todos: Todo[] = [];



  newTodo: Todo = new Todo ('', false);

  constructor(private todoSvc:TodosService) { }

  ngOnInit(): void {
    this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res.filter(todo => todo.completed === false)
    })
  }


  addNewTodo(){

    this.todoSvc.createTodo(this.newTodo)
    this.newTodo = new Todo('', false)
    setTimeout(() => {
      this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res.filter(todo => todo.completed === false)
    });
    },2300)
  }

  editTodo(){

  }

   toggleCompleted(todo:Todo){

    todo.completed = !todo.completed;
    this.todoSvc.updateTodo(todo.id, todo)
    setTimeout(() => {
      this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res.filter(todo => todo.completed === false)
    });
    },2300)
    
  }
  
  deleteTodo(id:number| undefined):void{
    this.todoSvc.delTodo(id)
    setTimeout(() => {
      this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res.filter(todo => todo.completed === false)
    });
    },2300)
  }


}
