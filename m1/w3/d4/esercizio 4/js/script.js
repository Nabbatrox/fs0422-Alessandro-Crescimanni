// Consegna punto (1)

let h1 = 'Corso di JavaScript'
console.log(h1)

let uppercase = h1.toUpperCase();
console.log(uppercase);

let lowercase = h1.toLowerCase();
console.log(lowercase);

// Suddivisione stringa in elementi, selezionarne 2 e unirli in una stringa

let suddivisione = h1.split(' ')
console.log(suddivisione)

let h1nuovo = (suddivisione[0])+(suddivisione[2]);
console.log(h1nuovo);

// Crea un array di persone

let persone = [

    'edoardo',

    'luca',

    'francesca',

    'beatrice'

];
console.log(persone);


// Leggi il terzo elemento

console.log(persone[3]);

// Passa all'array un valore tramite variabile

let personaNuova = 'claudio'

persone.push(personaNuova);
console.log(persone)

// Leggi la lunghezza dell'array

console.log(persone.length);

// Crea una funzione all'interno della quale utilizzare i valori numerici tratti da un array

function somma(){

    let numbers = [10, 20, 30];
    return numbers[2] + numbers[1] + numbers[0]
}

somma();
console.log(somma());

// Usa push/pop e shift/unshift

let personeNuovo = [
    
    'claudio',

    'francesca',

    'edoardo'
]


personeNuovo.push('alessandro');
console.log(personeNuovo);


personeNuovo.pop();
console.log(personeNuovo);


personeNuovo.shift();
console.log(personeNuovo);

personeNuovo.unshift('cocco');
console.log(personeNuovo);




