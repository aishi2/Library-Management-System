import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import { AdminComponent } from './admin/admin.component';
import { AuthorComponent } from './author/author.component';
import { LoanComponent } from './loan/loan.component';
import { PublisherComponent } from './publisher/publisher.component';
import { StudentComponent } from './student/student.component';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AddAuthorComponent } from './add-author/add-author.component';
import { AddPublisherComponent } from './add-publisher/add-publisher.component';
import { AddLoanComponent } from './add-loan/add-loan.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { UpdateAdminComponent } from './update-admin/update-admin.component';
import { UpdateAuthorComponent } from './update-author/update-author.component';
import { UpdateLoanComponent } from './update-loan/update-loan.component';
import { UpdatePublisherComponent } from './update-publisher/update-publisher.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { HomeComponent } from './home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    BookComponent,
    AdminComponent,
    AuthorComponent,
    LoanComponent,
    PublisherComponent,
    StudentComponent,
    AddAdminComponent,
    AddAuthorComponent,
    AddPublisherComponent,
    AddLoanComponent,
    AddStudentComponent,
    AddBooksComponent,
    UpdateAdminComponent,
    UpdateAuthorComponent,
    UpdateLoanComponent,
    UpdatePublisherComponent,
    UpdateBookComponent,
    UpdateStudentComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
