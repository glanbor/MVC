import controller.Controller;
import model.MainModel;
import model.Model;
import view.UsersView;
import model.FakeModel;
import view.EditUserView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();

        usersView.fireEventOpenUserEditForm(126);

        editUserView.fireEventUserDeleted(124);

        editUserView.fireEventUserChanged("IvanovEdit", 0, 5);
        usersView.fireEventShowDeletedUsers();

    }
}

