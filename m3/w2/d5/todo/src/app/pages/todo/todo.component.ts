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
      this.todos = res;
    })
  }



  addNewTodo(){

    this.todoSvc.createTodo(this.newTodo)
    this.newTodo = new Todo('', false)
    setTimeout(() => {
      this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res;
    });
    },300)
  }

  editTodo(){

  }
  
  deleteTodo(){}



}
