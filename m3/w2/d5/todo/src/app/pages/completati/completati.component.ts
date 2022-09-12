import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/todo';
import { TodosService } from 'src/app/todos.service';

@Component({
  selector: 'app-completati',
  templateUrl: './completati.component.html',
  styleUrls: ['./completati.component.scss']
})
export class CompletatiComponent implements OnInit {
  todos: Todo[] = [];



  newTodo: Todo = new Todo ('', false);


  constructor(private todoSvc:TodosService) { }

  ngOnInit(): void {
    this.todoSvc.getAllTodos()
    .then(res => {
      this.todos = res.filter(todo => todo.completed === true)
    })
  }

}
