import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Media } from '../models/media';

@Injectable({
  providedIn: 'root'
})
export class MediaService {
  private baseUrl = 'http://localhost:8080/project/medias';
  constructor(private http: HttpClient) { }


  createMedia(media:FormData): Observable<Object> {
   
    return this.http.post(`${this.baseUrl}`, media );
  }
  getAll() {
   
    return this.http.get<Media[]>(`${this.baseUrl}`);
  }
  deletemedia(mediaid:number){

    return this.http.delete(`${this.baseUrl}`+"/"+mediaid)
  }
}

