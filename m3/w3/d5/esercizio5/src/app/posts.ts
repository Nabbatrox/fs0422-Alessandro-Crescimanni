export class Posts {

    id:number | undefined
    title: string;
    content: string;
    constructor( title: string, content: string){
       
        this.title = title;
        this.content = content;
    }
    
}
