let arrayAnimali = ['🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐰', '🐯', '🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐯', '🐰'];
//libreria per icone
//https://html-css-js.com/html/character-codes/

let arrayComparison = [];
var victoryArray = [];

document.body.onload = startGame();

// mi serviranno alcune variabili 1. interval 2. una agganciata alla classe find 
// 3. una agganciata al'id modal 4. una agganciata alla classe timer

var interval;
var corretto = document.querySelector('.find');// A me non e' servito
var gameCompleted = document.querySelector('#modal');
var tempoAttuale = document.querySelector('.timer');

//una funzione che serve a mescolare in modo random gli elementi dell'array che viene passato 
// (l'array contiene le icone degli animali)
function shuffle(a) {
    var currentIndex = a.length;
    var temporaryValue, randomIndex;

    while (currentIndex !== 0) {
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex -= 1;
        temporaryValue = a[currentIndex];
        a[currentIndex] = a[randomIndex];
        a[randomIndex] = temporaryValue;
    }
    return a;
}
// una funzione che rimuove la classe active e chiama la funzione startGame()
function playAgain() {
    gameCompleted.classList.remove('active');
    gameCompleted.style.display = 'none';
    startGame();
}

function startGame() {

    clearInterval(interval)

    let time = new Date();

    time.setHours(0)
    time.setMinutes(0)
    time.setSeconds(0)

    interval = setInterval(function () {
        time.setSeconds(time.getSeconds() + 1)
        tempoAttuale.innerHTML = 'Tempo: ' + time.getMinutes() + ' min ' + time.getSeconds() + ' sec'
    }, 1000)

    var arrayShuffle = shuffle(arrayAnimali);
    let lista = document.querySelector('#griglia');
    lista.innerHTML = ''

    for (elemento of arrayShuffle) {
        let boxEsterno = document.createElement('div');
        let icon = document.createElement('div');
        icon.classList.add('icon');
        lista.append(boxEsterno);
        boxEsterno.append(icon);
        icon.innerHTML = elemento;
        icon.addEventListener("click", displayIcon)
    }
}
// la funzione startGame che pulisce il timer, dichiara un array vuoto, mescola casualmente l'array degli animali
// (var arrayShuffle = shuffle(arrayAnimali);), aggancia il contenitore con id griglia, 
// pulisce tutti gli elementi che eventualmente contiene
// poi fa ciclo per creare i 24 div child -> aggiunge la class e l'elemento dell'array in base all'indice progressivo
// chiama la funzione timer e associa a tutti gli elementi (div) di classe icon l'evento click e le due funzioni definit sotto
function displayIcon() {

    var icon = document.getElementsByClassName("icon");
    var icons = [...icon];

    //mette/toglie la classe show
    //mio commento: toggla anche disabled altrimenti potrei aggiungere la stessa icona all'array di convalida scatenando un falso positivo.
    this.classList.toggle("show");
    this.classList.toggle("disabled");

    //aggiunge l'oggetto su cui ha cliccato all'array del confronto
    //mio commento: in fase di assemblaggio del codice, mi sono servito dei console.log per capire il comportamento delle funzioni e dei fix dei problemi
    arrayComparison.push(this);
    console.log(arrayComparison);

    var len = arrayComparison.length;
    var victory = victoryArray.length;

    //se nel confronto ci sono due elementi
    if (len === 2) {
        //se sono uguali aggiunge la classe find
        //mio commento: ho rimosso QUASI tutto il codice in dotazione, e l'ho rifatto seguendo una logica diversa.
        if (arrayComparison[0].innerHTML === arrayComparison[1].innerHTML) {
            arrayComparison[0].classList.add("find", "disabled");
            arrayComparison[1].classList.add("find", "disabled");
            arrayComparison = [];
            victoryArray.push("count");
            console.log(victoryArray);
            console.log(victoryArray.length);
        }
        else {
            setTimeout(function () {
                arrayComparison[0].classList.remove("show", "disabled");
                arrayComparison[1].classList.remove("show", "disabled");
                arrayComparison = [];
            }, 800)
        }

        if (victory == 11) {
            console.log("victory");
            let timer = document.getElementById("tempoTrascorso");
            timer.innerHTML = tempoAttuale.innerHTML;
            gameCompleted.style.display = 'visible';
            gameCompleted.classList.add('active');
        }
    }
}

// con il timeout rimuove  la classe show per nasconderli

// mio commento: ho riorganizzato il timeout per fixare l'animazione della seconda icona cliccata dandogli un delay di 800ms, compattando il codice in poche righe.
// la stessa cosa avviene per le consegne sotto. Il codice e' stato scritto per come ci ragionavo, ammetto di non essere stato in grado di
// integrare il codice della consegna: l'ho trovato complicato per come lo stavo ragionando io e non riuscivo a comprenderlo in relazione a come lo stavo impostando sulla funzione playGame e displayIcon.


//una funzione che viene mostrata alla fine quando sono tutte le risposte esatte

// una funzione che nasconde la modale alla fine e riavvia il gioco

// una funzione che calcola il tempo e aggiorna il contenitore sotto
