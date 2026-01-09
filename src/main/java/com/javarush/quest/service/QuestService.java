package com.javarush.quest.service;

import com.javarush.quest.model.QuestStep;
import com.javarush.quest.model.QuickCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestService {
    private final Map<String, QuestStep> steps=new HashMap<>();
    private final List<QuickCard> cards=new ArrayList<>();

    public QuestService() {
        initSteps();
    }
    private void initSteps() {
        steps.put("start",new QuestStep(
                "start",
                "Cыграем в Покер?",
                "Конечно, поехали!",
                "Спасибо, воздержусь",
                "2Card",
                "lose",null
        ));
        // 3 карты на столе:
        cards.add(new QuickCard());
        cards.add(new QuickCard());
        cards.add(new QuickCard());
        steps.put("2Card",new QuestStep(
                "2Card",
                "Итак, три карты на столе, ставки сделаны!",
                "Уравниваем ставку, смотрим следующую карту",
                "Пас, выхожу из игры!",
                "3Card",
                "lose",cards.toString()
        ));
        // 4 карты на столе
        cards.add(new QuickCard());
        steps.put("3Card",new QuestStep(
                "3Card",
                "Четыре карты на столе, ставки сделаны!",
                "Уравниваем ставку, смотрим следующую карту",
                "Пас, выхожу из игры!",
                "4Card",
                "lose",cards.toString()
        ));
        // 5 карт на столе
        cards.add(new QuickCard());
        steps.put("4Card",new QuestStep(
                "4Card",
                "Пять карт на столе, ставки сделаны!",
                "Уравниваем ставку, смотрим следующую карту",
                "Пас, выхожу из игры!",
                "End game",
                "lose",cards.toString()
        ));
        // Завершение игры
        steps.put("End game",new QuestStep(
                "End game",
                "Все карты на столе-вскрываемся!!",
                null,
                null,
                null,
                null,cards.toString()
        ));
        // поражение
        steps.put("lose",new QuestStep(
                "lose",
                "Ты вышел из игры!",
                null,
                null,
                null,
                null,null
        ));
    }
    public QuestStep getStep (String id) {
        return steps.get(id);
    }
    public boolean isFinalStep (String stepId) {
        QuestStep step=steps.get(stepId);
        return step!=null&&step.getOption1()!=null;
    }
}
