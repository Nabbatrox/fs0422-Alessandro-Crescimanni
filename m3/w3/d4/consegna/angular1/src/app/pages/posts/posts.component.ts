import { Component, OnInit } from '@angular/core';
import { Posts } from 'src/app/classi';
import { ServiceService } from 'src/app/service.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

post: Posts = new Posts('','');
posts:Posts [] = [];
formAction: string | undefined;


  constructor(private postsSvc:ServiceService) { }

  ngOnInit(): void {

    this.postsSvc.getAllPosts().subscribe(posts => this.posts = posts)

  }

  savePost(){
    this.postsSvc.addPosts(this.post).subscribe(res => {
      this.posts.push(res)
      this.post = new Posts('','')
    })
  }


  editPost(){
    this.postsSvc.editPosts(this.post).subscribe(res => {
      let index = this.posts.findIndex(p => p.id === this.post.id)
      this.posts.splice(index,1, this.post)
      this.formAction = 'create'
    })
  }

  deletePost(post:Posts){
    this.postsSvc.deletePosts(post).subscribe(res => {
      let index = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index,1)
    })
  }

}
