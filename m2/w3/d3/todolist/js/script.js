
let button = document.querySelector('#salva')

button.addEventListener('click',function(){


    e.preventDefault();

    let testo = document.querySelector('#testo')


    //creo l'html 

    let div = document.createElement('div'); //è un metodo di DOM 
    div.innerHTML = testo.value;               //value = quello che c'è scritto nel testo
    div.classList.add('alert', 'alert-success');

    // document.querySelector('#lista').append(div);

let dataDiv = document.createElement('div');
dataDiv.innerHTML = data.value;



    div.append(dataDiv);
   document.querySelector('#lista').append(div);
   
   //svuoto il campo

   testo.value = '';
    data.value = '';




})

