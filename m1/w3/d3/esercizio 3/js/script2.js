//Esercizio sulle funzioni freccia

let calcoloDita = (ditaMani, ditaPiedi) => {
    return ` Attualmente ho ${ditaMani + ditaPiedi} dita, ma se mi trasferissi a Napoli... sarebbero ${ditaMani - ditaPiedi} sicuro`;
}

console.log(calcoloDita (10, 10))



//Funzione che calcola un range di anni

let annoAttuale = 2022

let annoNascita = prompt('Quando sei nato?')

const eta = annoAttuale - annoNascita

    if (eta >= 18) {

        document.write('Bevi responsabilmente')
    }

    else {

        document.write ('No')
    }






















