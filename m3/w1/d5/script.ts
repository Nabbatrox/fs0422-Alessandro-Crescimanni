

/////////////////////////////////////////////////////   INTERFACE   //////////////////////////////////////////////////


interface Smartphone {

    provider:string;
    carica:number;
    numeroChiamate:number;
    pianoTariffario:number;
    unaRicarica: number;


    ricarica(unaRicarica:number):void; // prende il valore di ricarica e lo aggiunge al saldo chiamato carica
    chiamata(minutiChiamata:number):void; // prende il valore di minutiChiamata e sottrae al saldo carica il tariffario per minuto
    costoChiamata(minutiChiamata: number):number // (extra) per calcolare il costo della chiamata.
    numero404():number; // prende il saldo e te lo mostra
    getNumeroChiamate():number; // prende il numeroChiamate e te le mostra
    azzeraChiamate():void; // prende il numeroChiamate e ne azzera il valore

}


//////////////////////////////////////////////////     USERS      //////////////////////////////////////////////////////////


class FirstUser implements Smartphone {

    provider: string;
    carica: number;
    numeroChiamate: number;
    pianoTariffario: number;
    unaRicarica: number;

    ricarica(unaRicarica: number): void {

        this.carica += unaRicarica
        
    }

    chiamata(minutiChiamata: number): void {

        this.carica -= (minutiChiamata * this.pianoTariffario)  

        this.numeroChiamate++
        
    }

    costoChiamata(minutiChiamata: number): number {

        return (minutiChiamata * this.pianoTariffario) 

    }

    numero404(): number {

        return this.carica
        
    }

    getNumeroChiamate(): number {

        return this.numeroChiamate
        
    }
    
    azzeraChiamate(): void {

        this.numeroChiamate -= this.numeroChiamate
        
    }

    constructor(provider: string, carica: number, numeroChiamate: number, pianoTariffario: number, unaRicarica: number){

        this.provider = provider
        this.carica = carica
        this.numeroChiamate = numeroChiamate
        this.pianoTariffario = pianoTariffario
        this.unaRicarica = unaRicarica

    }

}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class SecondUser implements Smartphone {

    provider: string;
    carica: number;
    numeroChiamate: number;
    pianoTariffario: number;
    unaRicarica: number;

    ricarica(unaRicarica: number): void {

        this.carica += unaRicarica
        
    }

    chiamata(minutiChiamata: number): void {

        this.carica -= (minutiChiamata * this.pianoTariffario)  

        this.numeroChiamate++
        
    }

    costoChiamata(minutiChiamata: number): number {

        return (minutiChiamata * this.pianoTariffario) 

    }

    numero404(): number {

        return this.carica
        
    }

    getNumeroChiamate(): number {

        return this.numeroChiamate
        
    }

    azzeraChiamate(): void {

        this.numeroChiamate -= this.numeroChiamate
        
    }

    constructor(provider: string, carica: number, numeroChiamate: number, pianoTariffario: number, unaRicarica: number){

        this.provider = provider
        this.carica = carica
        this.numeroChiamate = numeroChiamate
        this.pianoTariffario = pianoTariffario
        this.unaRicarica = unaRicarica

    }

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class ThirdUser implements Smartphone {

    provider: string;
    carica: number;
    numeroChiamate: number;
    pianoTariffario: number;
    unaRicarica: number;

    ricarica(unaRicarica: number): void {

        this.carica += unaRicarica
        
    }

    chiamata(minutiChiamata: number): void {

        this.carica -= (minutiChiamata * this.pianoTariffario)  

        this.numeroChiamate++
        
    }

    costoChiamata(minutiChiamata: number): number {

        return (minutiChiamata * this.pianoTariffario) 

    }

    numero404(): number {

        return this.carica
        
    }

    getNumeroChiamate(): number {

        return this.numeroChiamate
        
    }

    azzeraChiamate(): void {

        this.numeroChiamate -= this.numeroChiamate
        
    }

    constructor(provider: string, carica: number, numeroChiamate: number, pianoTariffario: number, unaRicarica: number){

        this.provider = provider
        this.carica = carica
        this.numeroChiamate = numeroChiamate
        this.pianoTariffario = pianoTariffario
        this.unaRicarica = unaRicarica

    }

}


/////////////////////////////////////////////////////////    ISTANZE    ////////////////////////////////////////////////////


console.log('Inizio primo utente')

let firstUser = new FirstUser("Vodafone", 50, 27, 0.20, 15);

firstUser.ricarica(15);
console.log(firstUser.carica);

// scateno il metodo ricarica con il parametro unaRicarica in ingresso, controllo e attesto che il parametro carica sia stato correttamente aggiornato. Risultato: 50 + 15 = 65.

firstUser.chiamata(18);
console.log(firstUser.numeroChiamate);

// scateno il metodo chiamata, pago la tariffa per minuto, incremento di uno il contatore chiamate.

firstUser.costoChiamata(18);
console.log(firstUser.costoChiamata(18));

// scateno il metodo extra costoChiamata per sapere quanto mi sia costata la chiamata precedente.

firstUser.numero404()
console.log(firstUser.carica);

// scateno il metodo numero404 e controllo quanto sono povero.

firstUser.getNumeroChiamate();
console.log(firstUser.numeroChiamate)

// scateno il metodo getNumeroChiamate per monitorare le chiamate effettuate.

firstUser.azzeraChiamate();
console.log(firstUser.numeroChiamate)

// scateno il metodo azzeraChiamate per resettare il counter delle chiamate effettuate.

console.log('Fine primo utente')


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


console.log('Inizio secondo utente')

let secondUser = new SecondUser("Tim", 8, 4, 0.20, 30);

secondUser.ricarica(30);
console.log(secondUser.carica);

secondUser.chiamata(47);
console.log(secondUser.numeroChiamate);

secondUser.costoChiamata(47);
console.log(secondUser.costoChiamata(47));

secondUser.numero404()
console.log(secondUser.carica);

secondUser.getNumeroChiamate();
console.log(secondUser.numeroChiamate)

secondUser.azzeraChiamate();
console.log(secondUser.numeroChiamate)

console.log('Fine secondo utente')


//////////////////////////////////////////////////////////////////////////////////////////////////////////////


console.log('Inizio terzo utente')

let thirdUser = new ThirdUser("Tre", 14, 108, 0.20, 10);

thirdUser.ricarica(10);
console.log(thirdUser.carica);

thirdUser.chiamata(22);
console.log(thirdUser.numeroChiamate);

thirdUser.costoChiamata(22);
console.log(thirdUser.costoChiamata(22));

thirdUser.numero404()
console.log(thirdUser.carica);

thirdUser.getNumeroChiamate();
console.log(thirdUser.numeroChiamate)

thirdUser.azzeraChiamate();
console.log(thirdUser.numeroChiamate)

console.log('Fine terzo utente')