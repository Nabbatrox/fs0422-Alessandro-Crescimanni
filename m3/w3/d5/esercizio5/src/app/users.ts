export class Users {

    id:number | undefined;
    username:string | undefined;
    email: string;
    password: string;
    constructor( email: string, password: string){
       
        this.email = email;
        this.password = password;
    }

}
