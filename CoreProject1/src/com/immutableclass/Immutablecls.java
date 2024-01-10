package com.immutableclass;

class WritingOwnImmutablecls {

		private int i;
		WritingOwnImmutablecls(int i){
			this.i=i;
		}
		public WritingOwnImmutablecls modify(int i) {
			if(this.i==i) {
				return this;
			}
			else {
				return new WritingOwnImmutablecls(i);
			}
		}
}
public class Immutablecls{
	public static void main(String[] args) {
		WritingOwnImmutablecls w=new WritingOwnImmutablecls(22);
//		WritingOwnImmutablecls w2= w.modify(100);
		WritingOwnImmutablecls w3=w.modify(22);
//		System.out.println(w==w2);
		System.out.println(w==w3);
	}
}
