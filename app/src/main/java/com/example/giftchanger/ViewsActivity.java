package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewsActivity extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton buttonBack;
    private RecyclerView recyclerView;
    private GiftAdapter adapter;
    private GiftsDatabaseHelper databaseHelper;
    List<Gift> gifts = new ArrayList<>();

    private String age;
    private String gender;

    private static final List<Integer> Age_18_35 = Arrays.asList(18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35);
    private static final List<Integer> AGE_0_2 = Arrays.asList(0, 1, 2);
    private static final List<Integer> AGE_3_6 = Arrays.asList(3,4,5,6);
    private static final List<Integer> AGE_7_12 = Arrays.asList(7,8,9,10,11,12);
    private static final List<Integer> AGE_13_17 = Arrays.asList(13_17);
    private static final List<Integer> AGE_35_60 = Arrays.asList(36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60);
    private static final List<Integer> AGE_61_100 = Arrays.asList(61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        buttonBack = findViewById(R.id.fabBack);
        buttonBack.setOnClickListener(this);

        age = getIntent().getStringExtra("age");
        gender = getIntent().getStringExtra("gender");

        // Вручную заполняем список подарков
        // Подарки для возрастной категории 0-2, мужской пол
        gifts.add(new Gift(21, "Мягкая игрушка-гремучка", "Мягкая игрушка-гремучка с яркими цветами и звуковыми эффектами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(22, "Пазл из пенного материала", "Пазл из пенного материала с изображением животных для развития логики", AGE_0_2, "Мужской"));
        gifts.add(new Gift(23, "Мультяшная кепка", "Мультяшная кепка с изображением любимого героя для стильного образа", AGE_0_2, "Мужской"));
        gifts.add(new Gift(24, "Развивающая пирамидка", "Развивающая пирамидка с различными формами и цветами для развития моторики", AGE_0_2, "Мужской"));
        gifts.add(new Gift(25, "Музыкальный мобиль", "Музыкальный мобиль с ночным светом и успокаивающей музыкой для снятия стресса", AGE_0_2, "Мужской"));
        gifts.add(new Gift(26, "Погремушка-ключ", "Погремушка-ключ с яркими кнопками и звуковыми эффектами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(27, "Мягкий поясок-грызунок", "Мягкий поясок-грызунок для развития зубов и моторики", AGE_0_2, "Мужской"));
        gifts.add(new Gift(28, "Комплект мягких шариков", "Комплект мягких шариков разных цветов и размеров для игр и занятий", AGE_0_2, "Мужской"));
        gifts.add(new Gift(29, "Мягкий учебник азбуки", "Мягкий учебник азбуки с яркими буквами и картинками для занятий", AGE_0_2, "Мужской"));
        gifts.add(new Gift(30, "Музыкальный плед", "Музыкальный плед с различными звуковыми эффектами и текстурами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(31, "Игрушка-прыгалка", "Игрушка-прыгалка в форме животного для активных игр и развития координации", AGE_0_2, "Мужской"));
        gifts.add(new Gift(32, "Музыкальный пульт", "Музыкальный пульт с звуковыми эффектами для развития слуха и творческой активности", AGE_0_2, "Мужской"));
        gifts.add(new Gift(33, "Игрушечный телефон-смартфон", "Игрушечный телефон-смартфон с функцией различных звуков и света", AGE_0_2, "Мужской"));
        gifts.add(new Gift(34, "Мягкое зеркальце", "Мягкое зеркальце с различными элементами для развития сенсорного опыта", AGE_0_2, "Мужской"));
        gifts.add(new Gift(35, "Развивающий мяч", "Развивающий мяч с яркими цветами и различными поверхностями для массажа", AGE_0_2, "Мужской"));
        gifts.add(new Gift(36, "Набор вкладышей", "Набор вкладышей с различными формами и цветами для игры и развития", AGE_0_2, "Мужской"));
        gifts.add(new Gift(37, "Кресло-качалка", "Кресло-качалка для расслабления и прогулок в домашних условиях", AGE_0_2, "Мужской"));
        gifts.add(new Gift(38, "Игрушечная машинка", "Игрушечная машинка с ярким дизайном для активных игр и развития", AGE_0_2, "Мужской"));
        gifts.add(new Gift(39, "Развивающая ковриковая пена", "Развивающая ковриковая пена с изображениями цифр и букв для развития знаний", AGE_0_2, "Мужской"));
        gifts.add(new Gift(40, "Мягкий животный конверт", "Мягкий животный конверт с различными элементами для игр и удобства", AGE_0_2, "Мужской"));
        gifts.add(new Gift(41, "Развивающие карточки", "Развивающие карточки с яркими изображениями и названиями для обучения", AGE_0_2, "Мужской"));
        gifts.add(new Gift(42, "Музыкальный морской краб", "Музыкальный морской краб с песнями и звуковыми эффектами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(43, "Мягкий резиновый молоток", "Мягкий резиновый молоток для безопасных игр и развития координации", AGE_0_2, "Мужской"));
        gifts.add(new Gift(44, "Рогатка с мягкими шарами", "Рогатка с мягкими шарами для игр на открытом воздухе и развития меткости", AGE_0_2, "Мужской"));
        gifts.add(new Gift(45, "Книги с выдвижными элементами", "Книги с выдвижными элементами для активного участия в обучении", AGE_0_2, "Мужской"));
        gifts.add(new Gift(46, "Мягкие наручники", "Мягкие наручники с замком для игры в полицейских и преступников", AGE_0_2, "Мужской"));
        gifts.add(new Gift(47, "Игрушка-парапланер", "Игрушка-парапланер для активной игры и фантазии", AGE_0_2, "Мужской"));
        gifts.add(new Gift(48, "Мягкий игрушечный дракончик", "Мягкий игрушечный дракончик с яркими крыльями и мягкими шипами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(49, "Музыкальная игрушка-передвижка", "Музыкальная игрушка-передвижка с яркими деталями и звуковыми эффектами", AGE_0_2, "Мужской"));
        gifts.add(new Gift(50, "Игрушка-миртвечинка", "Игрушка-миртвечинка с различными ремнями и замками для развития мелкой моторики", AGE_0_2, "Мужской"));

// Подарки для возрастной категории 0-2, женский пол
        gifts.add(new Gift(51, "Мягкая игрушка-котенок", "Мягкая игрушка-котенок с яркими цветами и звуковыми эффектами", AGE_0_2, "Женский"));
        gifts.add(new Gift(52, "Пазл из пенного материала", "Пазл из пенного материала с изображением животных для развития логики", AGE_0_2, "Женский"));
        gifts.add(new Gift(53, "Мультяшная кепка", "Мультяшная кепка с изображением любимого героя для стильного образа", AGE_0_2, "Женский"));
        gifts.add(new Gift(54, "Развивающая пирамидка", "Развивающая пирамидка с различными формами и цветами для развития моторики", AGE_0_2, "Женский"));
        gifts.add(new Gift(55, "Музыкальный мобиль", "Музыкальный мобиль с ночным светом и успокаивающей музыкой для снятия стресса", AGE_0_2, "Женский"));
        gifts.add(new Gift(56, "Погремушка-ключ", "Погремушка-ключ с яркими кнопками и звуковыми эффектами", AGE_0_2, "Женский"));
        gifts.add(new Gift(57, "Мягкий поясок-грызунок", "Мягкий поясок-грызунок для развития зубов и моторики", AGE_0_2, "Женский"));
        gifts.add(new Gift(58, "Комплект мягких шариков", "Комплект мягких шариков разных цветов и размеров для игр и занятий", AGE_0_2, "Женский"));
        gifts.add(new Gift(59, "Мягкий учебник азбуки", "Мягкий учебник азбуки с яркими буквами и картинками для занятий", AGE_0_2, "Женский"));
        gifts.add(new Gift(60, "Музыкальный плед", "Музыкальный плед с различными звуковыми эффектами и текстурами", AGE_0_2, "Женский"));
        gifts.add(new Gift(61, "Игрушка-прыгалка", "Игрушка-прыгалка в форме животного для активных игр и развития координации", AGE_0_2, "Женский"));
        gifts.add(new Gift(62, "Музыкальный пульт", "Музыкальный пульт с звуковыми эффектами для развития слуха и творческой активности", AGE_0_2, "Женский"));
        gifts.add(new Gift(63, "Игрушечный телефон-смартфон", "Игрушечный телефон-смартфон с функцией различных звуков и света", AGE_0_2, "Женский"));
        gifts.add(new Gift(64, "Мягкое зеркальце", "Мягкое зеркальце с различными элементами для развития сенсорного опыта", AGE_0_2, "Женский"));
        gifts.add(new Gift(65, "Развивающий мяч", "Развивающий мяч с яркими цветами и различными поверхностями для массажа", AGE_0_2, "Женский"));
        gifts.add(new Gift(66, "Набор вкладышей", "Набор вкладышей с различными формами и цветами для игры и развития", AGE_0_2, "Женский"));
        gifts.add(new Gift(67, "Кресло-качалка", "Кресло-качалка для расслабления и прогулок в домашних условиях", AGE_0_2, "Женский"));
        gifts.add(new Gift(68, "Игрушечная машинка", "Игрушечная машинка с ярким дизайном для активных игр и развития", AGE_0_2, "Женский"));
        gifts.add(new Gift(69, "Развивающая ковриковая пена", "Развивающая ковриковая пена с изображениями цифр и букв для развития знаний", AGE_0_2, "Женский"));
        gifts.add(new Gift(70, "Мягкий животный конверт", "Мягкий животный конверт с различными элементами для игр и удобства", AGE_0_2, "Женский"));
        gifts.add(new Gift(71, "Развивающие карточки", "Развивающие карточки с яркими изображениями и названиями для обучения", AGE_0_2, "Женский"));
        gifts.add(new Gift(72, "Музыкальный морской краб", "Музыкальный морской краб с песнями и звуковыми эффектами", AGE_0_2, "Женский"));
        gifts.add(new Gift(73, "Мягкий резиновый молоток", "Мягкий резиновый молоток для безопасных игр и развития координации", AGE_0_2, "Женский"));
        gifts.add(new Gift(74, "Рогатка с мягкими шарами", "Рогатка с мягкими шарами для игр на открытом воздухе и развития меткости", AGE_0_2, "Женский"));
        gifts.add(new Gift(75, "Книги с выдвижными элементами", "Книги с выдвижными элементами для активного участия в обучении", AGE_0_2, "Женский"));
        gifts.add(new Gift(76, "Мягкие наручники", "Мягкие наручники с замком для игры в полицейских и преступников", AGE_0_2, "Женский"));
        gifts.add(new Gift(77, "Игрушка-парапланер", "Игрушка-парапланер для активной игры и фантазии", AGE_0_2, "Женский"));
        gifts.add(new Gift(78, "Мягкий игрушечный дракончик", "Мягкий игрушечный дракончик с яркими крыльями и мягкими шипами", AGE_0_2, "Женский"));
        gifts.add(new Gift(79, "Музыкальная игрушка-передвижка", "Музыкальная игрушка-передвижка с яркими деталями и звуковыми эффектами", AGE_0_2, "Женский"));
        gifts.add(new Gift(80, "Мягкая игрушка-медвежонок", "Мягкая игрушка-медвежонок с яркими цветами и звуковыми эффектами", AGE_0_2, "Женский"));

// Подарки для возрастной категории 3-6, мужской пол
        gifts.add(new Gift(81, "Шахматы для детей", "Набор шахмат для детей с яркими фигурками для развития логики и памяти", AGE_3_6, "Мужской"));
        gifts.add(new Gift(82, "Учебное пособие по математике", "Учебное пособие по математике для дошкольников с интересными заданиями", AGE_3_6, "Мужской"));
        gifts.add(new Gift(83, "Лабиринт", "Лабиринт с разноцветными шариками для развития мелкой моторики и координации", AGE_3_6, "Мужской"));
        gifts.add(new Gift(84, "Деревянные кубики-пазлы", "Деревянные кубики-пазлы для составления различных картинок и развития творческих способностей", AGE_3_6, "Мужской"));
        gifts.add(new Gift(85, "Конструктор-мозаика", "Конструктор-мозаика с различными деталями для творчества и развития моторики", AGE_3_6, "Мужской"));
        gifts.add(new Gift(86, "Раскраски с наклейками", "Набор раскрасок с наклейками для развития мелкой моторики и творческого мышления", AGE_3_6, "Мужской"));
        gifts.add(new Gift(87, "Лего-конструктор", "Набор Лего-конструктор с различными деталями и инструкциями для сборки моделей", AGE_3_6, "Мужской"));
        gifts.add(new Gift(88, "Пазл с изображением машин", "Пазл с изображением машин для развития внимания и логического мышления", AGE_3_6, "Мужской"));
        gifts.add(new Gift(89, "Пластилин", "Набор пластилина разных цветов для развития моторики и творческих навыков", AGE_3_6, "Мужской"));
        gifts.add(new Gift(90, "Набор кистей и красок", "Набор кистей и красок для рисования и творческих экспериментов", AGE_3_6, "Мужской"));
        gifts.add(new Gift(91, "Магнитная лаборатория", "Магнитная лаборатория с различными элементами для экспериментов и развития усидчивости", AGE_3_6, "Мужской"));
        gifts.add(new Gift(92, "Игровой конструктор-мозаика", "Игровой конструктор-мозаика с разными деталями для развития творческих способностей и познавательного мышления", AGE_3_6, "Мужской"));
        gifts.add(new Gift(93, "Пазл с изображением животных", "Пазл с изображением животных для развития внимания и координации", AGE_3_6, "Мужской"));
        gifts.add(new Gift(94, "Развивающий набор для счета", "Развивающий набор для счета с цветными шариками и числами", AGE_3_6, "Мужской"));
        gifts.add(new Gift(95, "Вкладыши с буквами и цифрами", "Вкладыши с буквами и цифрами для знакомства с алфавитом и числами", AGE_3_6, "Мужской"));
        gifts.add(new Gift(96, "Магнитный конструктор", "Магнитный конструктор с различными формами и элементами для развития творческих истративных способностей", AGE_3_6, "Мужской"));
        gifts.add(new Gift(97, "Логическая игра \"Змейка\"", "Логическая игра \"Змейка\" со специальными кубиками и картами", AGE_3_6, "Мужской"));
        gifts.add(new Gift(98, "Набор мультяшных персонажей", "Набор мультяшных персонажей для развития фантазии и ролевых игр", AGE_3_6, "Мужской"));
        gifts.add(new Gift(99, "Разукрашиваемая майка", "Разукрашиваемая майка с набором разных красок и кисточек", AGE_3_6, "Мужской"));
        gifts.add(new Gift(100, "Конструктор-робот", "Конструктор-робот с различными деталями для сборки и программирования", AGE_3_6, "Мужской"));

// Подарки для возрастной категории 3-6, женский пол
        gifts.add(new Gift(101, "Шахматы для детей", "Набор шахмат для детей с яркими фигурками для развития логики и памяти", AGE_3_6, "Женский"));
        gifts.add(new Gift(102, "Учебное пособие по математике", "Учебное пособие по математике для дошкольников с интересными заданиями", AGE_3_6, "Женский"));
        gifts.add(new Gift(103, "Лабиринт", "Лабиринт с разноцветными шариками для развития мелкой моторики и координации", AGE_3_6, "Женский"));
        gifts.add(new Gift(104, "Деревянные кубики-пазлы", "Деревянные кубики-пазлы для составления различных картинок и развития творческих способностей", AGE_3_6, "Женский"));
        gifts.add(new Gift(105, "Конструктор-мозаика", "Конструктор-мозаика с различными деталями для творчества и развития моторики", AGE_3_6, "Женский"));
        gifts.add(new Gift(106, "Раскраски с наклейками", "Набор раскрасок с наклейками для развития мелкой моторики и творческого мышления", AGE_3_6, "Женский"));
        gifts.add(new Gift(107, "Лего-конструктор", "Набор Лего-конструктор с различными деталями и инструкциями для сборки моделей", AGE_3_6, "Женский"));
        gifts.add(new Gift(108, "Пазл с изображением машин", "Пазл с изображением машин для развития внимания и логического мышления", AGE_3_6, "Женский"));
        gifts.add(new Gift(109, "Пластилин", "Набор пластилина разных цветов для развития моторики и творческих навыков", AGE_3_6, "Женский"));
        gifts.add(new Gift(110, "Набор кистей и красок", "Набор кистей и красок для рисования и творческих экспериментов", AGE_3_6, "Женский"));
        gifts.add(new Gift(111, "Магнитная лаборатория", "Магнитная лаборатория с различными элементами для экспериментов и развития усидчивости", AGE_3_6, "Женский"));
        gifts.add(new Gift(112, "Игровой конструктор-мозаика", "Игровой конструктор-мозаика с разными деталями для развития творческих способностей и познавательного мышления", AGE_3_6, "Женский"));
        gifts.add(new Gift(113, "Пазл с изображением животных", "Пазл с изображением животных для развития внимания и координации", AGE_3_6, "Женский"));
        gifts.add(new Gift(114, "Развивающий набор для счета", "Развивающий набор для счета с цветными шариками и числами", AGE_3_6, "Женский"));
        gifts.add(new Gift(115, "Вкладыши с буквами и цифрами", "Вкладыши с буквами и цифрами для знакомства с алфавитом и числами", AGE_3_6, "Женский"));
        gifts.add(new Gift(116, "Магнитный конструктор", "Магнитный конструктор с различными формами и элементами для развития творческих истративных способностей", AGE_3_6, "Женский"));
        gifts.add(new Gift(117, "Логическая игра \"Змейка\"", "Логическая игра \"Змейка\" со специальными кубиками и картами", AGE_3_6, "Женский"));
        gifts.add(new Gift(118, "Набор мультяшных персонажей", "Набор мультяшных персонажей для развития фантазии и ролевых игр", AGE_3_6, "Женский"));
        gifts.add(new Gift(119, "Разукрашиваемая майка", "Разукрашиваемая майка с набором разных красок и кисточек", AGE_3_6, "Женский"));
        gifts.add(new Gift(120, "Конструктор-робот", "Конструктор-робот с различными деталями для сборки и программирования", AGE_3_6, "Женский"));

// Продолжайте добавлять подарки для остальных возрастных категорий и полов


        // Подарки для возрастной категории 7-12, мужской пол
        gifts.add(new Gift(121, "Строительный набор", "Строительный набор с различными инструментами и аксессуарами для творческих игр", AGE_7_12, "Мужской"));
        gifts.add(new Gift(122, "Настольная игра \"Монополия\"", "Настольная игра \"Монополия\" для развития стратегического мышления и финансовой грамотности", AGE_7_12, "Мужской"));
        gifts.add(new Gift(123, "Набор экспериментов", "Набор экспериментов для проведения различных научных опытов и открытий", AGE_7_12, "Мужской"));
        gifts.add(new Gift(124, "Велосипед", "Велосипед с ярким дизайном и прочной рамой для активного отдыха на свежем воздухе", AGE_7_12, "Мужской"));
        gifts.add(new Gift(125, "Конструктор-робот", "Конструктор-робот с возможностью программирования и управления", AGE_7_12, "Мужской"));
        gifts.add(new Gift(126, "Музыкальный инструмент", "Музыкальный инструмент (гитара, фортепиано, барабаны и т. д.) для развития музыкальных способностей", AGE_7_12, "Мужской"));
        gifts.add(new Gift(127, "Набор фокусов", "Набор фокусов с иллюзиями и необычными трюками для развития ловкости и внимания", AGE_7_12, "Мужской"));
        gifts.add(new Gift(128, "Логическая головоломка", "Логическая головоломка для развития мышления и умения находить решения", AGE_7_12, "Мужской"));
        gifts.add(new Gift(129, "Книга приключений", "Книга приключений с захватывающими историями и загадками для развития воображения", AGE_7_12, "Мужской"));
        gifts.add(new Gift(130, "Волшебный набор", "Волшебный набор с реквизитом для фокусов и фокусирования", AGE_7_12, "Мужской"));
        gifts.add(new Gift(131, "Конструктор-модель", "Конструктор-модель с возможностью собрать и управлять", AGE_7_12, "Мужской"));
        gifts.add(new Gift(132, "Наклейки на стену", "Наклейки на стену с изображениями героев фильмов и мультфильмов", AGE_7_12, "Мужской"));
        gifts.add(new Gift(133, "Скейтборд", "Скейтборд с качественным каркасом и яркими рисунками для активных городских поездок", AGE_7_12, "Мужской"));
        gifts.add(new Gift(134, "Спортивный инвентарь", "Спортивный инвентарь (мяч, бита, ракетка и т. д.) для активных игр и занятий спортом", AGE_7_12, "Мужской"));
        gifts.add(new Gift(135, "Пазл из 1000 элементов", "Пазл из 1000 элементов с изображением пейзажей и достопримечательностей", AGE_7_12, "Мужской"));
        gifts.add(new Gift(136, "Набор научных опытов", "Набор научных опытов для проведения экспериментов и открытий в различных областях науки", AGE_7_12, "Мужской"));
        gifts.add(new Gift(137, "Стреляющая игрушка", "Стреляющая игрушка (лазерный пистолет, дартс и т. д.) для развлечений в компании", AGE_7_12, "Мужской"));
        gifts.add(new Gift(138, "Самокат", "Самокат с удобным рулем и прочным каркасом для активного передвижения", AGE_7_12, "Мужской"));
        gifts.add(new Gift(139, "Мозаика-пазл", "Мозаика-пазл с разноцветными деталями для творчества и развития моторики", AGE_7_12, "Мужской"));
        gifts.add(new Gift(140, "Набор настольных игр", "Набор настольных игр (шашки, шахматы, морской бой и т. д.) для развития логики и тактики", AGE_7_12, "Мужской"));
        gifts.add(new Gift(141, "Детективная игра", "Детективная игра с загадками и расследованиями для развития логики и логического мышления", AGE_7_12, "Мужской"));
        gifts.add(new Gift(142, "Опыты с магнитами", "Опыты с магнитами для изучения магнитных свойств и законов физики", AGE_7_12, "Мужской"));
        gifts.add(new Gift(143, "Электронный конструктор", "Электронный конструктор с возможностью сборки и программирования", AGE_7_12, "Мужской"));
        gifts.add(new Gift(144, "Ручка-роллербол", "Ручка-роллербол с ярким дизайном и гладким письмом для творческих записей", AGE_7_12, "Мужской"));
        gifts.add(new Gift(145, "Математический набор", "Математический набор с увлекательными задачами и головоломками", AGE_7_12, "Мужской"));

// Подарки для возрастной категории 7-12, женский пол
        gifts.add(new Gift(146, "Строительный набор", "Строительный набор с различными инструментами и аксессуарами для творческих игр", AGE_7_12, "Женский"));
        gifts.add(new Gift(147, "Настольная игра \"Монополия\"", "Настольная игра \"Монополия\" для развития стратегического мышления и финансовой грамотности", AGE_7_12, "Женский"));
        gifts.add(new Gift(148, "Набор экспериментов", "Набор экспериментов для проведения различных научных опытов и открытий", AGE_7_12, "Женский"));
        gifts.add(new Gift(149, "Велосипед", "Велосипед с ярким дизайном и прочной рамой для активного отдыха на свежем воздухе", AGE_7_12, "Женский"));
        gifts.add(new Gift(150, "Конструктор-робот", "Конструктор-робот с возможностью программирования и управления", AGE_7_12, "Женский"));
        gifts.add(new Gift(151, "Музыкальный инструмент", "Музыкальный инструмент (гитара, фортепиано, барабаны и т. д.) для развития музыкальных способностей", AGE_7_12, "Женский"));
        gifts.add(new Gift(152, "Набор фокусов", "Набор фокусов с иллюзиями и необычными трюками для развития ловкости и внимания", AGE_7_12, "Женский"));
        gifts.add(new Gift(153, "Логическая головоломка", "Логическая головоломка для развития мышления и умения находить решения", AGE_7_12, "Женский"));
        gifts.add(new Gift(154, "Книга приключений", "Книга приключений с захватывающими историями и загадками для развития воображения", AGE_7_12, "Женский"));
        gifts.add(new Gift(155, "Волшебный набор", "Волшебный набор с реквизитом для фокусов и фокусирования", AGE_7_12, "Женский"));
        gifts.add(new Gift(156, "Конструктор-модель", "Конструктор-модель с возможностью собрать и управлять", AGE_7_12, "Женский"));
        gifts.add(new Gift(157, "Наклейки на стену", "Наклейки на стену с изображениями героев фильмов и мультфильмов", AGE_7_12, "Женский"));
        gifts.add(new Gift(201, "Набор для создания браслетов", "Набор для создания ярких браслетов из различных материалов и бусин", AGE_7_12, "Женский"));
        gifts.add(new Gift(202, "Книга фантастических рассказов", "Книга с увлекательными фантастическими рассказами и приключениями", AGE_7_12, "Женский"));
        gifts.add(new Gift(203, "Магический набор иллюзиониста", "Магический набор с реквизитом для фокусов и выступлений", AGE_7_12, "Женский"));
        gifts.add(new Gift(204, "Дневник с замком", "Дневник с замком и ярким дизайном для секретных записей", AGE_7_12, "Женский"));
        gifts.add(new Gift(205, "Набор для создания мягких игрушек", "Набор для создания мягких игрушек из фетра с разных животных", AGE_7_12, "Женский"));
        gifts.add(new Gift(206, "Настольная игра \"Добродушный дракон\"", "Настольная игра с приключениями доброго дракона и его друзей", AGE_7_12, "Женский"));
        gifts.add(new Gift(207, "Музыкальная шкатулка", "Музыкальная шкатулка для хранения украшений с мелодией известных песен", AGE_7_12, "Женский"));
        gifts.add(new Gift(208, "Набор для создания свечей", "Набор для создания своих собственных цветных и ароматных свечей", AGE_7_12, "Женский"));
        gifts.add(new Gift(209, "Книга о моде и стиле", "Книга о моде и стиле с советами и идеями для создания своего уникального образа", AGE_7_12, "Женский"));
        gifts.add(new Gift(210, "Набор для кулинарных экспериментов", "Набор для проведения интересных и вкусных кулинарных экспериментов", AGE_7_12, "Женский"));
        gifts.add(new Gift(211, "Фотокамера для детей", "Фотокамера для детей с возможностью делать яркие и красочные снимки", AGE_7_12, "Женский"));
        gifts.add(new Gift(212, "Чехлы на телефон", "Набор ярких чехлов на телефон с различными дизайнами и орнаментами", AGE_7_12, "Женский"));
        gifts.add(new Gift(213, "Цветочный набор для выращивания", "Набор для выращивания цветов с семенами и грунтом в компактном горшочке", AGE_7_12, "Женский"));
        gifts.add(new Gift(214, "Набор для создания украшений", "Набор для создания красивых украшений из бисера, бусин и ниток", AGE_7_12, "Женский"));
        gifts.add(new Gift(215, "Пазл с изображением замков", "Пазл с красивым изображением замков для развития внимания и логического мышления", AGE_7_12, "Женский"));
// Подарки для возрастной категории 13-17, мужской пол
        gifts.add(new Gift(301, "Портативная игровая консоль", "Портативная игровая консоль для игр в пути и веселых приключений", AGE_13_17, "Мужской"));
        gifts.add(new Gift(302, "Активный гироскутер", "Активный гироскутер для крутых трюков и активного времяпровождения", AGE_13_17, "Мужской"));
        gifts.add(new Gift(303, "Наушники с шумоподавлением", "Наушники с функцией шумоподавления для наслаждения качественным звуком", AGE_13_17, "Мужской"));
        gifts.add(new Gift(304, "Профессиональная камера", "Профессиональная камера с возможностью съемки в HD и включения различных режимов", AGE_13_17, "Мужской"));
        gifts.add(new Gift(305, "Спортивный снаряд", "Спортивный снаряд (футбольный мяч, баскетбольный мяч, волейбольный мяч и т. д.) для занятий спортом", AGE_13_17, "Мужской"));
        gifts.add(new Gift(306, "Домашний тренажерный комплекс", "Домашний тренажерный комплекс для поддержания физической формы и здоровья", AGE_13_17, "Мужской"));
        gifts.add(new Gift(307, "Экшн-камера", "Экшн-камера для съемки видео в экстремальных условиях и на открытом воздухе", AGE_13_17, "Мужской"));
        gifts.add(new Gift(308, "Смартфон", "Смартфон с продвинутыми функциями и возможностью установки различных приложений", AGE_13_17, "Мужской"));
        gifts.add(new Gift(309, "Набор электроники", "Набор различной электроники (гаджеты, геймерские аксессуары и т. д.) для технологичных развлечений", AGE_13_17, "Мужской"));
        gifts.add(new Gift(310, "Беспилотный квадрокоптер", "Беспилотный квадрокоптер с камерой для съемки видео сверху и занятий пилотированием", AGE_13_17, "Мужской"));
        gifts.add(new Gift(311, "Умный наручный часы", "Умные наручные часы с множеством функций и возможностью связи с телефоном", AGE_13_17, "Мужской"));
        gifts.add(new Gift(312, "Хромакей-студия", "Набор для создания хромакей-студии и съемки видео с использованием спецэффектов", AGE_13_17, "Мужской"));
        gifts.add(new Gift(313, "Переносная акустика", "Переносная акустика с высоким качеством звука и функцией беспроводной передачи", AGE_13_17, "Мужской"));
        gifts.add(new Gift(314, "Дизайнерский набор", "Дизайнерский набор с кистями, красками и карандашами для развития творческого мышления", AGE_13_17, "Мужской"));
        gifts.add(new Gift(315, "Книга по программированию", "Книга по программированию для изучения языков программирования и создания своих проектов", AGE_13_17, "Мужской"));
        gifts.add(new Gift(316, "Солнцезащитные очки", "Солнцезащитные очки с модными оправами и высокой степенью защиты от солнца", AGE_13_17, "Мужской"));
        gifts.add(new Gift(317, "Сумка-рюкзак", "Стильная сумка-рюкзак для комфортного ношения вещей и аксессуаров", AGE_13_17, "Мужской"));
        gifts.add(new Gift(318, "Маникюрный набор", "Маникюрный набор с инструментами и аксессуарами для создания и дизайна ногтей", AGE_13_17, "Мужской"));
        gifts.add(new Gift(319, "Набор для создания украшений", "Набор для создания красивых украшений из бисера, бусин и ниток", AGE_13_17, "Мужской"));
        gifts.add(new Gift(320, "Книга о моде и стиле", "Книга о моде и стиле с советами и идеями для создания своего уникального образа", AGE_13_17, "Мужской"));
// Подарки для возрастной категории 13-17, женский пол
        gifts.add(new Gift(201, "Макияжный набор", "Качественный набор косметики для создания различных макияжей", AGE_13_17, "Женский"));
        gifts.add(new Gift(202, "Stylish кепка", "Стильная кепка с модным дизайном для создания стильного образа", AGE_13_17, "Женский"));
        gifts.add(new Gift(203, "Переносная колонка", "Переносная колонка с качественным звуком для прослушивания музыки", AGE_13_17, "Женский"));
        gifts.add(new Gift(204, "Набор для плетения браслетов", "Набор для создания красивых браслетов из ниток и бусин", AGE_13_17, "Женский"));
        gifts.add(new Gift(205, "Уютный плед", "Уютный плед с мягкими и теплыми материалами для комфортного отдыха", AGE_13_17, "Женский"));
        gifts.add(new Gift(206, "Книга фантастических романов", "Книга с увлекательными фантастическими романами и приключениями", AGE_13_17, "Женский"));
        gifts.add(new Gift(207, "Набор кистей и красок", "Набор кистей и красок для рисования и творческого самовыражения", AGE_13_17, "Женский"));
        gifts.add(new Gift(208, "Стильная сумка", "Стильная сумка с модным дизайном для хранения вещей", AGE_13_17, "Женский"));
        gifts.add(new Gift(209, "Умная часы", "Умные часы с функциями подсчета шагов, уведомлений и другими полезными функциями", AGE_13_17, "Женский"));
        gifts.add(new Gift(210, "Набор инструментов для рукоделия", "Набор инструментов для создания различных рукодельных изделий", AGE_13_17, "Женский"));
        gifts.add(new Gift(211, "Активные наушники", "Активные наушники с водонепроницаемостью и отличным звуком", AGE_13_17, "Женский"));
        gifts.add(new Gift(212, "Книга по дизайну интерьера", "Книга по дизайну интерьера с советами и идеями для создания уютного пространства", AGE_13_17, "Женский"));
        gifts.add(new Gift(213, "Спортивный инвентарь", "Спортивный инвентарь (скакалка, гантели, мяч и т.д.) для активных тренировок и занятий спортом", AGE_13_17, "Женский"));
        gifts.add(new Gift(214, "Караоке-микрофон", "Караоке-микрофон с возможностью подключения и песен и записи голоса", AGE_13_17, "Женский"));
        gifts.add(new Gift(215, "Чехол на телефон", "Чехол на телефон с модным дизайном и защитой от повреждений", AGE_13_17, "Женский"));





        List<Gift> filteredGifts = new ArrayList<>();

        // Фильтруем список подарков по возрасту и полу
        for (Gift gift : gifts) {
            if (gift.getGender().equals(gender) && gift.getAgeIds().contains(Integer.parseInt(age))) {
                filteredGifts.add(gift);
            }
        }

        adapter = new GiftAdapter(filteredGifts);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.fabBack) {
            Intent intentBack = new Intent(getApplicationContext(), ChangeActivity.class);
            startActivity(intentBack);
            finish();
        }
    }

    // Дополнительных методы для редактирования данных подарков

    public void editGiftName(int position, String name) {
        Gift gift = adapter.getGiftList().get(position);
        gift.setName(name);
        databaseHelper.updateGift(gift);
        adapter.notifyItemChanged(position);
    }

    public void editGiftAge(int position, List<Integer> ageIds) {
        Gift gift = adapter.getGiftList().get(position);
        gift.setAgeIds(ageIds);
        databaseHelper.updateGift(gift);
        adapter.notifyItemChanged(position);
    }


    public void editGiftGender(int position, String gender) {
        Gift gift = adapter.getGiftList().get(position);
        gift.setGender(gender);
        databaseHelper.updateGift(gift);
        adapter.notifyItemChanged(position);
    }
}

// продолжи заполнять списки gifts.add на моменте Подарки для возрастной категории 18-35, добавь в ту категорию еще 20 подарков по примеру, подарки не должны повторяться.
// Придумай эти подарки сам, без моей помощи. используй списки данные сверху и опирайся на пример. после заполнения категории 18-35 приступай к следующей, а там пиши по 20 подарков на каждую категорию.
// Главное, чтобы подарки сходились по смыслу с полом и возрастной категорией.