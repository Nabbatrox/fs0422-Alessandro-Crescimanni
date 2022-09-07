import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AttivoComponent } from './pages/attivo/attivo.component';
import { HomeComponent } from './pages/home/home.component';
import { InattiviComponent } from './pages/inattivi/inattivi.component';

const routes: Routes = [{path:'',
component: HomeComponent},
{path:'attivo',
component: AttivoComponent},
{path:'inattivi',
component: InattiviComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
