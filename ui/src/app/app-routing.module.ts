import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';
import { AdminComponent } from './admin/admin.component';
import { AuthorComponent } from './author/author.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { UpdatePublisherComponent } from './update-publisher/update-publisher.component';
import { UpdateLoanComponent } from './update-loan/update-loan.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { UpdateAuthorComponent } from './update-author/update-author.component';
import { UpdateAdminComponent } from './update-admin/update-admin.component';
import { PublisherComponent } from './publisher/publisher.component';
import { StudentComponent } from './student/student.component';
import { LoanComponent } from './loan/loan.component';
import { AddPublisherComponent } from './add-publisher/add-publisher.component';
import { AddLoanComponent } from './add-loan/add-loan.component';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AddAuthorComponent } from './add-author/add-author.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { HomeComponent } from './home/home.component';
import { AddBooksComponent } from './add-books/add-books.component';

const routes: Routes = [
  {
    path: 'books',
    component: BookComponent,
  },
  
  {
    path: 'admin',
    component: AdminComponent,
  },

  {
    path: 'author',
    component: AuthorComponent,
  },
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'add-books',
    component: AddBooksComponent,
  },
  {
    path: 'add-author',
    component: AddAuthorComponent,
  },
  {
    path: 'add-admin',
    component: AddAdminComponent,
  },
  {
    path: 'add-loan',
    component: AddLoanComponent,
  },
  {
    path: 'add-publisher',
    component: AddPublisherComponent,
  },
  {
    path: 'add-student',
    component: AddStudentComponent,
  },
{
    path: 'loan',
    component: LoanComponent,
  },
  {
    path: 'student',
    component: StudentComponent,
  },
  {
    path: 'publisher',
    component: PublisherComponent,
  },
  {
    path: 'update-admin/:id',
    component: UpdateAdminComponent,
  },
  {
    path: 'update-author/:id',
    component: UpdateAuthorComponent,
  },
  {
    path: 'update-book/:id',
    component: UpdateBookComponent,
  },
  {
    path: 'update-loan/:id',
    component: UpdateLoanComponent,
  },
  {
    path: 'update-publisher/:id',
    component: UpdatePublisherComponent,
  },
  {
    path: 'update-student/:id',
    component: UpdateStudentComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
