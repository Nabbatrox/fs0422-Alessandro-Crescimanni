export interface TodoList{

    id?:number;
    title:string;
    completed:boolean;

}

export class Todo implements TodoList {

    id?: number;
    title: string;
    completed:boolean;

    constructor(title: string, completed:boolean){
      this.title = title;
      this.completed = completed;
    }
  }
