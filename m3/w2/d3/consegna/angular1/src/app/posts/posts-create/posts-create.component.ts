import { Component, OnInit } from '@angular/core';
import { Posts } from 'src/app/posts';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-posts-create',
  templateUrl: './posts-create.component.html',
  styleUrls: ['./posts-create.component.css']
})
export class PostsCreateComponent implements OnInit {

  constructor(private postSvc: PostsService) { }

  ngOnInit(): void {
  }

  newPost:Posts = new Posts('','','');


  save(){
    this.postSvc.addNew(this.newPost)
  }
}


