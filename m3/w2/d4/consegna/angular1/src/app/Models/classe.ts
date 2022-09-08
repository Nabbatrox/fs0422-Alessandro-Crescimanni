export class Post {
    id: number | undefined;
    title: string;
    content: string;
    constructor( title: string, content: string, id?: number){
      this.title = title;
      this.content = content;
      this.id = id;
    }
  }

  export class User {
username: string;
email: string;
rule: string;
constructor( username: string, email: string){
    this.username = username;
    this.email = email;
    this.rule = "user";
}
  }