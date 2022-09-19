import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { Posts } from 'src/app/posts';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-editpost',
  templateUrl: './editpost.component.html',
  styleUrls: ['./editpost.component.scss']
})
export class EditpostComponent implements OnInit {

  posts: Posts[] = [];

  post: Posts = new Posts('','','');

  constructor(private postSvc:PostsService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    
      // this.route.params.subscribe(params => {
      //   this.post.id = params['post.id'];
        
      // });
      
  }

  editPostById(post:Posts): void {

    this.postSvc.editPost(post)
    .subscribe(post => this.posts.push(post));

}

}