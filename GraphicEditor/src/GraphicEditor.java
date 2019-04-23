import java.util.Scanner;

public class GraphicEditor {
	static Shape head = null, current = null, prev = null, tail = null, tmp = null;

	public static void main(String[] args) {

		System.out.println("�׷��� ������ beauty�� �����մϴ�.");

		while (true) {

			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();

			// ����
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
					System.out.print("������ �� �����ϴ�.");
					break;
				} else {
					System.out.print("������ ������ ��ġ >>");
					int c = in.nextInt();
					if (c == 1) {
						head = head.getNext();
					} else {

						for (; c > 1; c--) {
							if (current == null) {
								System.out.print("������ �� �����ϴ�.");
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
					System.out.println("������ �� �����ϴ�.");
				else {
					while (tmp != null) {
						tmp.draw();
						tmp = tmp.getNext();
					}
				}

			}

			else if (a == 4) {
				System.out.println("beauty�� �����մϴ�.");
				break;
			}

		}

	}
}
