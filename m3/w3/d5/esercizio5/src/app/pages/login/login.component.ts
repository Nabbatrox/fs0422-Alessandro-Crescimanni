import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Users } from 'src/app/users'
import { AuthService} from 'src/app/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  form!: FormGroup

  constructor(
    private auth: AuthService,
    private router: Router,) {}

  ngOnInit(): void {

    this.form = new FormGroup({
      username: new FormControl(null, [Validators.required]) ,
      email: new FormControl(null, [Validators.required]),
      password: new FormControl(null, [Validators.required])
      })

  }
  userLogin(): void {
  this.auth.login(new Users( this.form.value.username, this.form.value.email, this.form.value.password))
    .subscribe(authentication => {
      this.auth.saveAuthToStorage(authentication)
      this.router.navigate(['/posts'])
    })
  }

}
