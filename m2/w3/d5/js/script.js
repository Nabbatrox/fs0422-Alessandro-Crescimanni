const jsonDir = './users.json';
const visibleAttr = ['username', 'firstName', 'lastName', 'gender', 'profileURL', 'email']

let container = document.createElement('div');
document.body.prepend(container);

fetch(jsonDir)
.then(res => res.json())
.then(res => {

    for(let user of res) {

    let table = document.createElement('table');
    table.classList.add('table', 'table-dark', 'table-striped', 'table-hover', 'my-5')
    container.append(table);

    
    let thead = document.createElement('thead');
    table.append(thead);

    let tbody = document.createElement('tbody');
    table.append(tbody);

    let trbody = document.createElement('tr');
    tbody.append(trbody);

    let trhead = document.createElement('tr');
    thead.append(trhead);

        for (prop in user){

            if(visibleAttr.includes(prop)){

                let th = document.createElement('th');
                th.innerText = prop;
                trhead.append(th);

                let td = document.createElement('td');
                td.setAttribute('scope', 'col')
                td.innerHTML = user[prop];
                trbody.append(td);
                console.log(prop);

                if (prop == 'profileURL') {

                    let img = document.createElement('img');
                    td.innerHTML = '';
                    img.src = user[prop];
                    td.append(img);

                }
            }
        }
    }
})