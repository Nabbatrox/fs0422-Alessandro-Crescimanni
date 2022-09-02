/////////////////////////////////////////////////////   INTERFACE   //////////////////////////////////////////////////
//////////////////////////////////////////////////     USERS      //////////////////////////////////////////////////////////
var FirstUser = /** @class */ (function () {
    function FirstUser(provider, carica, numeroChiamate, pianoTariffario, unaRicarica) {
        this.provider = provider;
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.pianoTariffario = pianoTariffario;
        this.unaRicarica = unaRicarica;
    }
    FirstUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    FirstUser.prototype.chiamata = function (minutiChiamata) {
        this.carica -= (minutiChiamata * this.pianoTariffario);
        this.numeroChiamate++;
    };
    FirstUser.prototype.costoChiamata = function (minutiChiamata) {
        return (minutiChiamata * this.pianoTariffario);
    };
    FirstUser.prototype.numero404 = function () {
        return this.carica;
    };
    FirstUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    FirstUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate -= this.numeroChiamate;
    };
    return FirstUser;
}());
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
var SecondUser = /** @class */ (function () {
    function SecondUser(provider, carica, numeroChiamate, pianoTariffario, unaRicarica) {
        this.provider = provider;
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.pianoTariffario = pianoTariffario;
        this.unaRicarica = unaRicarica;
    }
    SecondUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    SecondUser.prototype.chiamata = function (minutiChiamata) {
        this.carica -= (minutiChiamata * this.pianoTariffario);
        this.numeroChiamate++;
    };
    SecondUser.prototype.costoChiamata = function (minutiChiamata) {
        return (minutiChiamata * this.pianoTariffario);
    };
    SecondUser.prototype.numero404 = function () {
        return this.carica;
    };
    SecondUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    SecondUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate -= this.numeroChiamate;
    };
    return SecondUser;
}());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
var ThirdUser = /** @class */ (function () {
    function ThirdUser(provider, carica, numeroChiamate, pianoTariffario, unaRicarica) {
        this.provider = provider;
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.pianoTariffario = pianoTariffario;
        this.unaRicarica = unaRicarica;
    }
    ThirdUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    ThirdUser.prototype.chiamata = function (minutiChiamata) {
        this.carica -= (minutiChiamata * this.pianoTariffario);
        this.numeroChiamate++;
    };
    ThirdUser.prototype.costoChiamata = function (minutiChiamata) {
        return (minutiChiamata * this.pianoTariffario);
    };
    ThirdUser.prototype.numero404 = function () {
        return this.carica;
    };
    ThirdUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    ThirdUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate -= this.numeroChiamate;
    };
    return ThirdUser;
}());
/////////////////////////////////////////////////////////    ISTANZE    ////////////////////////////////////////////////////
console.log('Inizio primo utente');
var firstUser = new FirstUser("Vodafone", 50, 27, 0.20, 15);
firstUser.ricarica(15);
console.log(firstUser.carica);
// scateno il metodo ricarica con il parametro unaRicarica in ingresso, controllo e attesto che il parametro carica sia stato correttamente aggiornato. Risultato: 50 + 15 = 65.
firstUser.chiamata(18);
console.log(firstUser.numeroChiamate);
// scateno il metodo chiamata, pago la tariffa per minuto, incremento di uno il contatore chiamate.
firstUser.costoChiamata(18);
console.log(firstUser.costoChiamata(18));
// scateno il metodo extra costoChiamata per sapere quanto mi sia costata la chiamata precedente.
firstUser.numero404();
console.log(firstUser.carica);
// scateno il metodo numero404 e controllo quanto sono povero.
firstUser.getNumeroChiamate();
console.log(firstUser.numeroChiamate);
// scateno il metodo getNumeroChiamate per monitorare le chiamate effettuate.
firstUser.azzeraChiamate();
console.log(firstUser.numeroChiamate);
// scateno il metodo azzeraChiamate per resettare il counter delle chiamate effettuate.
console.log('Fine primo utente');
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('Inizio secondo utente');
var secondUser = new SecondUser("Tim", 8, 4, 0.20, 30);
secondUser.ricarica(30);
console.log(secondUser.carica);
secondUser.chiamata(47);
console.log(secondUser.numeroChiamate);
secondUser.costoChiamata(47);
console.log(secondUser.costoChiamata(47));
secondUser.numero404();
console.log(secondUser.carica);
secondUser.getNumeroChiamate();
console.log(secondUser.numeroChiamate);
secondUser.azzeraChiamate();
console.log(secondUser.numeroChiamate);
console.log('Fine secondo utente');
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('Inizio terzo utente');
var thirdUser = new ThirdUser("Tre", 14, 108, 0.20, 10);
thirdUser.ricarica(10);
console.log(thirdUser.carica);
thirdUser.chiamata(22);
console.log(thirdUser.numeroChiamate);
thirdUser.costoChiamata(22);
console.log(thirdUser.costoChiamata(22));
thirdUser.numero404();
console.log(thirdUser.carica);
thirdUser.getNumeroChiamate();
console.log(thirdUser.numeroChiamate);
thirdUser.azzeraChiamate();
console.log(thirdUser.numeroChiamate);
console.log('Fine terzo utente');
