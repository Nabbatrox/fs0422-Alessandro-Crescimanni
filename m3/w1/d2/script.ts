
var deposit:number = 10000; //inizializziamo la variabile globale "deposit" 

var addInterest:number = deposit/100*10; //inizializziamo la variabile globale addInterest

class SonAccount {      //creazione della Classe SonAccount che avrà come metodi opeDeposit e oneWhitDraw

    public name: string;
    public surname: string;
    public balanceInit: number;

    constructor(name: string, surname: string, accountBalance: number) {
        this.name = name; 
        this.surname = surname; 
        this.balanceInit = accountBalance;

}

oneDeposit():void {   //primo metodo


    let newBalanceInit:number = this.balanceInit + deposit;
    console.log(newBalanceInit);
   
}

oneWhitDraw():void {  //secondo metodo

    let newBalanceInit:number = this.balanceInit + deposit;
    let whitdraw:number = 5000;
    let SecondBalanceInit:number = newBalanceInit - whitdraw;
    console.log(SecondBalanceInit);
}

}

let son = new SonAccount('Edoardo', 'Trovarelli', 0)  //nuova istanza della Classe SonAccount

son.oneDeposit(); //scateniamo le due funzioni oneDeposit e oneWhitDraw

son.oneWhitDraw();
 
class MotherAccount extends SonAccount {   //creazioni nuova Classe estendendo la classe SonAccount 

   public addInterest: number; 
    constructor(name: string, surname: string, accountBalance: number, addInterest:number ) {
       
super(name, surname, accountBalance)

this.addInterest = addInterest;
}

oneMotherDeposit():void {


    let newMotherBalanceInit:number = this.balanceInit + deposit - this.addInterest ;
    console.log(newMotherBalanceInit);
   
}

oneMotherWhitDraw():void {

    let newBalanceInit:number = this.balanceInit + deposit;
    let whitdraw:number = 5000;
    let SecondMotherBalanceInit:number = newBalanceInit - whitdraw -this.addInterest;
    console.log(SecondMotherBalanceInit);
}

}

let mother = new MotherAccount('Maria', 'Rossi', 0, addInterest)

mother.oneMotherDeposit();

mother.oneMotherWhitDraw();



