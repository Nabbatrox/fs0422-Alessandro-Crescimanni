
let budget = 3000;
let i = 0;

while (budget >= 0) {

    let spesa = Math.random() * 200;

    console.log(budget);

    if (budget <= 1500 && budget >= 1000 && i == 0) {

        let messaggio = document.createElement("div");

        messaggio.innerHTML = 'Attento, stai diventando povero';

        document.body.append(messaggio);

        i+= 1;

    }

    if (budget <= 999 && budget >= 0 && i == 1) {

        let messaggio2 = document.createElement("div");

        messaggio2.innerHTML = 'Congratulazioni, sei povero';

        document.body.append(messaggio2);

        i+= 1;

    }

    if (spesa > budget) {

        break

    }

    budget -= spesa;


}


