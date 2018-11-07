package com.example.demo.lombok.step1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data // 아래가 전부 포함
// Equivalent to 
// @Getter 
// @Setter 
// @RequiredArgsConstructor 
// @ToString 
// @EqualsAndHashCode. 


//@EqualsAndHashCode // Equals, HashCode 재정의
//@ToString
//@Getter
//@Setter
@NoArgsConstructor // 파라미터를 받지않는 생성자를 만들어라
@AllArgsConstructor // 파라미터를 모두 받는 생성자를 만들어라
public class Emp {
	private int empno;
	private String ename;
	private String job;
	
//	@Override
//	public String toString() {
//		return "{" + empno + "," + ename + "," job + "}";
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Emp)) {
//			throw new RuntimeException("use Emp instance");
//		}
//		Emp that = (Emp) obj;
//		if(this.empno == that.empno) {
//			return true;
//		}
//		return false;
//	}
}
