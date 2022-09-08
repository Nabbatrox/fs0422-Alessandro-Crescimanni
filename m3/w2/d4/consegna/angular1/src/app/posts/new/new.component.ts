import { Component, OnInit } from '@angular/core';
import { Post, User } from 'src/app/Models/classe';
import { PostsService } from 'src/app/posts.service';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {

  constructor(private postSvc:PostsService, private userSvc:UserService) { }

  ngOnInit(): void {
  }

  newUser:User = new User("", "");
  newPost:Post = new Post("","");

  save(){
  if(this.newUser.username == )
    this.postSvc.addPost(this.newPost)
  }


  

}
