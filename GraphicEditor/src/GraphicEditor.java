import java.util.Scanner;

public class GraphicEditor {
	static Shape head = null, current = null, prev = null, tail = null, tmp = null;

	public static void main(String[] args) {

		System.out.println("그래픽 에디터 beauty를 실행합니다.");

		while (true) {

			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();

			// 삽입
			if (a == 1) {
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int b = in.nextInt();
				switch (b) {
				case 1:
					Line l = new Line();
					if (head == null) {
						head = l;
						tail = l;
					} else {
						tail.setNext(l);
						tail = l;
					}
					
					l.draw();
					break;

				case 2:
					Rect r = new Rect();
					if (head == null) {
						head = r;
						tail = r;
					} else {
						tail.setNext(r);
						tail = r;
					}
					r.draw();
					break;
					
				case 3:
					Circle c = new Circle();
					if (head == null) {
						head = c;
						tail = c;
					} else {
						tail.setNext(c);
						tail = c;
					}
					c.draw();
					break;
					
				default:
					break;
				}
			}

			else if (a == 2) {
				if (head == null) {
					System.out.print("삭제할 게 없습니다.");
					break;
				} else {
					System.out.print("삭제할 도형의 위치 >>");
					int c = in.nextInt();
					if (c == 1) {
						head = head.getNext();
					} else {

						for (; c > 1; c--) {
							if (current == null) {
								System.out.print("삭제할 수 없습니다.");
								break;
							}

							prev = current;
							current = current.getNext();

						}
						prev.setNext(current.getNext());
						break;
					}
				}
			} else if (a == 3) {
				tmp = head;
				if (tmp == null)
					System.out.println("삭제할 수 없습니다.");
				else {
					while (tmp != null) {
						tmp.draw();
						tmp = tmp.getNext();
					}
				}

			}

			else if (a == 4) {
				System.out.println("beauty를 종료합니다.");
				break;
			}

		}

	}
}
