import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AttiviComponent } from './attivi/attivi.component';
import { InattiviComponent } from './inattivi/inattivi.component';
import { HeaderComponent } from './header/header.component';
import { NewComponent } from './posts/new/new.component';
import { EditComponent } from './posts/edit/edit.component';
import { ListComponent } from './posts/list/list.component';
import { FormsModule } from '@angular/forms';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AttiviComponent,
    InattiviComponent,
    HeaderComponent,
    NewComponent,
    EditComponent,
    ListComponent
    

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
