let nome = "Mirtilla";
console.log(nome);
var utente = "cliente";
console.log(utente);
const PI = 3.14;
console.log(PI);

//nome = "Lilla";
console.log(nome);
utente = "amministratore";
console.log(utente);
//PI = 4;
//console.log(PI);

let primoLavoro = "developing";
let secondoLavoro = "formazione";

let lavoro = primoLavoro + " e " + secondoLavoro;

console.log('io mi occupo di: ' + lavoro);
console.log('io mi occupo di: ' + primoLavoro + " e " + secondoLavoro);

let JS = true;
console.log('Let JS: ' + JS);

let anno;
console.log(anno);

anno = 1991;

const annoAttuale = 2021;

let anniMirtilla = annoAttuale - anno;
console.log(anniMirtilla);

console.log(nome + " ha: " + anniMirtilla + " anni");

let a = 10 + 5;
let b = 3;
let c = 10;
let somma = b + c + 2;
console.log(somma);

c++;
console.log(c);
a--;
console.log(a);

let nomePet = "Billo";
let colorePet = "rosso";
const pet = "il nome del pet: " + nomePet + "e il suo colore è: " + colorePet;
console.log(pet);

// sintassi letterale con backtick -> apice inverso
const pet1 = `il nome del pet: ${nomePet}  e il suo colore è: ${colorePet}`;
console.log(pet1);

console.log('string con \n\ righe \n\ multiple');
console.log(`string con 
righe 
multiple`);

// Alla variabile let posso assegnare var solo se let si trova all'interno di un blockscope

var nomeDonna = 'Carin'
console.log(nomeDonna);


{
    let nomeDonna = 'Avgin'
    console.log(nomeDonna);
}

var nomeDonna = 'Avgin'
console.log(nomeDonna)

// Const e' una costante che non puo' essere sovrascritta con let/var o un altro const, ma soltanto dichiarata prima del suo utilizzo
const numbers = 123456
console.log(numbers);

//var numbers = 35 <- il risultato in console.log() sarebbe errore di sintassi: 'numbers' e' stato gia' dichiarato.
//console.log(numbers); <- vedi sopra


// Interagiamo con diversi tipi di dati e interagiamo con addizioni e sottrazioni

let nomeWoman = 'Carin'

let gender = 'Donna'

let anni = 26

var annoOggi = '2022'

console.log(typeof(nomeWoman), typeof(anni))
console.log(nomeWoman + " e' una " + gender + ' nata nel ' + (annoOggi - anni)) 






 

