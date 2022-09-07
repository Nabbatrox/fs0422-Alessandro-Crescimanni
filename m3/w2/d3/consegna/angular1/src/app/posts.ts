


export class Posts {
    id:number|undefined;
    title: string;
    body:string;
    type:string;
    constructor( title:string, body:string, type:string) {
        this.title = title;
        this.body = body;
        this.type = type;
    }

}

