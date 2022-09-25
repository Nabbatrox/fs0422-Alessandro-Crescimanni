export class Posts {
    id:number | undefined
    title: string;
    content: string;
    constructor( title: string, content: string){
       
        this.title = title;
        this.content = content;
    }
  
}



export class Users {
    id:number | undefined;
    email:string;
    password?:string | undefined;
    constructor(  email:string, password:string | undefined) {
       
        this.email = email;
    this.password = password
       
  }
    
}