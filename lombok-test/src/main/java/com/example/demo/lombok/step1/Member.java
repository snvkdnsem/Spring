package com.example.demo.lombok.step1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/*
 * 
     Equivalent to 
     @Getter 
     @Setter 
     @RequiredArgsConstructor 
     @ToString 
     @EqualsAndHashCode.
*/
@Data // 론복에게 위의 코드를 만들어 달라 요청
// @Getter 
// @Setter 
// 굳이 전부 필요없다면 위 코드처럼 사용하는게 맞음
@NoArgsConstructor
@AllArgsConstructor
public class Member {
   @NonNull private int id;
   @NonNull private String name;
   private String email;
   
//   public int getId() {
//      return id;
//   }
//   public void setId(int id) {
//      this.id = id;
//   }
//   public String getName() {
//      return name;
//   }
//   public void setName(String name) {
//      this.name = name;
//   }
//   public String getEmail() {
//      return email;
//   }
//   public void setEmail(String email) {
//      this.email = email;
//   }
   
   
}