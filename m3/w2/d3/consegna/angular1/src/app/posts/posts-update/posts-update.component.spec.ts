import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostsUpdateComponent } from './posts-update.component';

describe('PostsUpdateComponent', () => {
  let component: PostsUpdateComponent;
  let fixture: ComponentFixture<PostsUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostsUpdateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostsUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
