package Do_it.chapter09.abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer() {
			@Override
			public void display() {

			}

			@Override
			public void typing() {

			}
		};
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook() {
			@Override
			public void typing() {

			}
		};
		Computer c4 = new MyNoteBook();
	}
}
