import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from './auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'RepairBookingApplication';
  isCollapsed = true;
  constructor(private auth:AuthService, private router: Router){
  }

   logout(): void {

    this.auth.logOut()
    this.router.navigate(['/'])
  
}
}
