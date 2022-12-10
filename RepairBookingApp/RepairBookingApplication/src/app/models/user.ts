export class User {
    id: number | undefined;
    name: string;
    lastname: string;
    username: string;
    email: string;
    password: string;
    active: boolean;
    role: string[];

    constructor(id: number | undefined, name: string, lastname: string, username: string, email: string, password: string, active: boolean, role: string[]) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = active;
        this.role = role;
    
}
}
