export class Users {

    id:number | undefined;
    username:string | undefined;
    name:string | undefined;
    lastname:string | undefined;
    address:string | undefined;
    email: string;
    password: string;
    role: string | undefined;

    constructor( username: string, email: string, password: string){
        this.username = username;
        this.email = email;
        this.password = password;
        
    }

}
