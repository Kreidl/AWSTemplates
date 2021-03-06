import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AwsvmComponent } from './awsvm/awsvm.component';
import { AwshomeComponent } from './awshome/awshome.component';


const routes: Routes = [
  { path: 'awsvmcreate', component: AwsvmComponent },
  { path: 'awshome', component: AwshomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
