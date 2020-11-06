package validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasklist_DTO;

public class MessageValidators {
    //バリデーションを実行する
    public static List<String> validate(Tasklist_DTO t) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }
        return errors;

    }
    //タスクの必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }
        return"";
    }
}
