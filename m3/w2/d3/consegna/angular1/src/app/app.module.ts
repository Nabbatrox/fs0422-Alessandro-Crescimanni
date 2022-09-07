import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ButtonComponent } from './button/button.component';
import { FormComponent } from './form/form.component';
import { CardComponent } from './card/card.component';
import { HomeComponent } from './pages/home/home.component';
import { AttivoComponent } from './pages/attivo/attivo.component';
import { InattiviComponent } from './pages/inattivi/inattivi.component';
import { HeaderComponent } from './header/header.component';
import { PostsCreateComponent } from './posts/posts-create/posts-create.component';
import { PostsUpdateComponent } from './posts/posts-update/posts-update.component';
import { PostsDeleteComponent } from './posts/posts-delete/posts-delete.component';
import { PostsReadComponent } from './posts/posts-read/posts-read.component';

@NgModule({
  declarations: [
    AppComponent,
    ButtonComponent,
    FormComponent,
    CardComponent,
    HomeComponent,
    AttivoComponent,
    InattiviComponent,
    HeaderComponent,
    PostsCreateComponent,
    PostsUpdateComponent,
    PostsDeleteComponent,
    PostsReadComponent
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
