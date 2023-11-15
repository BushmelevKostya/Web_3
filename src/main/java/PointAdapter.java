import app.web.model.Point;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("pointAdapterBean")
public class PointAdapter {
	public void submit() {
		try {
			System.out.println(1);
			Point point = new Point();
			point.submit();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
