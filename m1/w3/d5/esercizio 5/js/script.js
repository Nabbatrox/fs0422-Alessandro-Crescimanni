
function addSymbol(button){
    
    let display = document.getElementById("display");
    let symbol = button.getAttribute('data-symbol');


    display.value += button.getAttribute('data-symbol');

}


function back(){


    display.value = display.value.substring(0, display.value.length - 1);

}



function clear1(){

   display.value = ""

}
  

function calc() {

    let display = document.getElementById("display");
    let totale = eval(display.value);
    display.value = totale
}


