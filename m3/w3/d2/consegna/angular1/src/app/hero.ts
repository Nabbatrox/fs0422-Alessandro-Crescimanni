export class Hero {
    name: string;
    alterego: string;
    power: string;
    enemy:string;
    planet:string;
    weakness?: string;
    constructor(name:string, alterego:string, power:string, enemy:string, planet:string, weakness?:string) {
this.name = name;
this.alterego = alterego
this.power = power
this.enemy = enemy
this.planet = planet
this.weakness = weakness
}
}
