package com.serafynurh.myhealth;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView img;
    TextView tvTitle, tvSample;
    int images[] ={R.mipmap.apple,R.mipmap.apricots,R.mipmap.artichokes,R.mipmap.asparagus,R.mipmap.avocado,R.mipmap.bananas,R.mipmap.beets,R.mipmap.broccoli,R.mipmap.brusselsprouts,R.mipmap.cabbages,R.mipmap.cantaloupe,R.mipmap.carrots,R.mipmap.cauliflower,R.mipmap.celery,R.mipmap.coconutwater,R.mipmap.coriander,R.mipmap.corn,R.mipmap.courgettes,R.mipmap.cowpeas,R.mipmap.cranberry,R.mipmap.cucumber,R.mipmap.dates,R.mipmap.eggplant,R.mipmap.figs,R.mipmap.garlic,R.mipmap.grapefruit, R.mipmap.grapes,R.mipmap.greenpeas,R.mipmap.kales,R.mipmap.leeks,R.mipmap.lemon,R.mipmap.lettuce,R.mipmap.mangofruit,R.mipmap.mint,R.mipmap.mushrooms,R.mipmap.okra,R.mipmap.onions,R.mipmap.orangefruit,R.mipmap.parsnips,R.mipmap.pears,R.mipmap.peasprouts,R.mipmap.pumpkins,R.mipmap.radishes,R.mipmap.spinach,R.mipmap.spirulina,R.mipmap.squash,R.mipmap.strawberry,R.mipmap.sunflowersprouts,R.mipmap.sweetpotatoes,R.mipmap.swisschard,R.mipmap.tangerine,R.mipmap.tofu,R.mipmap.tomatoes,R.mipmap.turmeric,R.mipmap.waterchestnuts,R.mipmap.watercress,R.mipmap.watermelon,R.mipmap.wheatgrass,R.mipmap.yam,R.mipmap.zucchini};
    /*==========================================ARRAY OF SHORT SYNOPSYS FOR EACH MOVIE=======================================================*/
    String[] desc ={"Apples are one of the healthiest foods a person can eat. They are high in fiber and vitamin C, and they are also low in calories, have only a trace of sodium, and no fat or cholesterol.",
            "Apricots are packed with Vitamin A, which is also known as retinol. It’s fat soluble, and helps in the enhancement of vision, among other things. And it keeps the immune system in check, protecting your skin in the process. \n" + "Retinol and Beta Carotene (also present in apricots) also reduces the chances of you developing a serious eye-related disorder called Neovascular ARMD – an age-related macular degeneration that causes loss of vision over the years.",
            "Fresh artichoke is an excellent source of vitamin, folic acid; provides about 68 µg per 100 g (17% of recommended daily allowance). Folic acid acts as a co-factor for enzymes involved in the synthesis of DNA. Scientific studies have proven that adequate levels of folates in the diet during the pre-conception period, and during early pregnancy may help prevent neural tube defects in the newborn baby.",
            "Fresh asparagus is rich sources of folates. 100 g of spears provide about 54 µg or 14% of RDA of folic acid. Folates are one of the essential co-factors for the DNA synthesis inside the cell. Scientific studies have shown that adequate consumption of folates in the diet during pre-conception period and early pregnancy helps prevent neural tube defects in the newborn baby.",
            "They are an excellent source of soluble and insoluble dietary fiber. 100 grams of fruit provides 6.7 g or about 18% of recommended daily intake of fiber. Dietary fiber helps lower blood cholesterol levels and prevent constipation.",
            "Bananas are a good source of vitamin-B6 (pyridoxine); provides about 28% of daily-recommended allowance. Pyridoxine is an essential B-complex vitamin that has a beneficial role in the treatment of neuritis, and anemia. Further, it helps decrease homocysteine (one of the triggering factors in coronary artery disease (CHD) and stroke episodes) levels within the human body.",
            "Beets are a rich source of the phytochemical compound, glycine betaine. Betaine has the property of lowering homocysteine levels within the blood. Homocysteine, one of the highly toxic metabolite, promotes platelet clot as well as atherosclerotic plaque formation, which, otherwise, can be harmful to blood vessels. High levels of homocysteine in the blood result in the development of coronary heart disease (CHD), stroke and peripheral vascular diseases.",
            "Broccoli is an exceptionally rich source of vitamin-C; providing 89.2 mg or about 150% of RDA per 100 g. Vitamin-C is a powerful natural antioxidant, and immune modulator helps fight against flu-causing viruses.",
            "Brussel sprouts are excellent sources of vitamin-C; 100 g sprouts provide about 85 mg or 142% of the RDA. Together with other antioxidant vitamins such as vitamin-A and-E, it helps protect the human body from the viral illness by trapping harmful free radicals.",
            "Cabbage is an excellent source of vitamin-K, provides about 63% of RDA levels. Vitamin-K has the potential role in bone metabolism through promoting osteoblastic activity. Sufficient amounts of vitamin-K in the diet contribute immensely to your bone health. Also, vitamin-K also has established a role in the cure of Alzheimer's disease patients by limiting neuronal damage in their brain.",
            "Cantaloupe is rich in antioxidant flavonoids such as beta-carotene, lutein, zeaxanthin, and cryptoxanthin. These antioxidants have the ability to help protect cells and other structures in the body from oxygen-free radicals and hence; offer protection against colon, prostate, breast, endometrial, lung, and pancreatic cancers.",
            "Sweet and crunchy carrots are notably rich in anti-oxidants, vitamins and dietary fiber. They provide only 41 calories per 100 g, a negligible amount of fat and no cholesterol.They are an exceptionally rich source of carotenes and vitamin-A. 100 g fresh carrot contains 8,285 µg of beta-carotene and 16,706 IU of vitamin-A. Studies have found that flavonoid compounds in carrots may offer to protect from skin, lung and oral cavity cancers.",
            "Cauliflower contains several anti-cancer phytochemicals like sulforaphane and plant sterols such as indole-3-carbinol, which appears to function as an anti-estrogen agent. Together, these compounds have proven benefits against prostate, breast, cervical, colon, ovarian cancers by their cancer-cell growth inhibition, cytotoxic effects on cancer cells.",
            "Celery contains antioxidants and polysaccharides that are known to act as anti-inflammatories, especially flavonoid and polyphenol antioxidants. These support overall health, especially as someone ages, by fighting free-radical damage (or oxidative stress) that can lead to inflammation. Inflammation is often a contributing cause of chronic diseases like cancer, heart disease, arthritis and many more.",
            "Coconut water is an ideal drink for weight loss. It is low in calories and easy on the stomach. In fact, this light and refreshing drink contains various bioactive enzymes that aid digestion and boost fat metabolism. Plus, coconut water is rich in potassium, which helps balance out sodium.",
            "The health benefits of coriander include its use in the treatment of skin inflammation, high cholesterol levels, diarrhea, mouth ulcers, anemia, indigestion, menstrual disorders, smallpox, conjunctivitis, skin disorders, and blood sugar disorders, while also benefiting eye care.",
            "Corn is full of Vitamin B constituents, like Thamin and Niacin, which are essential for nerve health and cognitive function. Corn is also a good source of Pantothenic acid, which is essential for carbohydrate, protein and lipid metabolism in the body. Plus, corn represents a large percentage of the daily folate requirement, which plays an important role in DNA synthesis and repair and aides cell and tissue growth.",
            "If you’re trying to lose weight then you should make the courgette number one on your shopping (or growing) list. They’re super low in calories because of their high water content so you can pretty much chomp to your heart’s content (providing you don’t deep fry them!). They may not pack the nutritional punch of other green vegetables (broccoli, kale etc.) but they do contain significant levels of potassium to control blood pressure and vitamin C to boost your immune system.",
            "The cowpeas possess dietary fibers which promote and softens the stool. It reduces the constipation with the easy flow of bulky stool. The bulk is added to the stool because the fiber helps to absorb the water. The diet rich in fiber reduces the chances of small pouches in the colon and hemorrhoids.",
            "Cranberries are a very good source of vitamin C, dietary fiber, and manganese, as well as a good source of vitamin E, vitamin K and copper ",
            "Cucumbers have mild diuretic property, which perhaps attributed to their free-water, and potassium and low sodium content. It helps in checking weight gain and high blood pressure.",
            "Fresh dates compose of soft, easily digestible flesh and simple sugars like fructose and dextrose. 100 g of mejdool dates hold 277 calories. When eaten, they replenish energy and revitalize the body instantly. For these qualities, they traditionally served to break the fast during Ramadan month since ancient times.",
            "Eggplant vegetable is an excellent source of minerals like manganese, copper, iron and potassium. The antioxidant enzyme, superoxide dismutase utilizes manganese as a co-factor. Potassium is an important intracellular electrolyte that helps counter pressing (hypertension) effects of sodium.",
            "Figs are high in natural sugars, minerals and soluble fibre. Figs are rich in minerals including potassium, calcium, magnesium, iron and copper and are a good source of antioxidant vitamins A, E and K that contribute to health and wellness.",
            "Garlic is an excellent source of minerals and vitamins that are essential for optimum health. The bulbs are one of the richest sources of potassium, iron, calcium, magnesium, manganese, zinc, and selenium. Selenium is a heart-healthy mineral and is an essential cofactor for antioxidant enzymes within the body. The human body uses manganese as a co-factor for the antioxidant enzyme, superoxide dismutase. Iron is essential for red blood cell formation.",
            "Grapefruit is a popular citrus fruit that is a terrific source of vitamins, fiber and other nutrients. Grapefruit is known for its antioxidant and immunity-boosting capabilities as well as its digestive and cholesterol-lowering benefits.\n" + "\n" + "It has been hailed as a popular diet food for many years because it is widely believed to boost weight loss. While a grapefruit diet is far too extreme, the fruit can be added to one's diet for a healthy weight loss plan.", "\n" + "\n" +
            "Grapes are a rich source of micronutrient minerals like copper, iron, and manganese. Copper and manganese are an essential cofactor of the antioxidant enzyme, superoxide dismutase. Iron is especially concentrated in raisins. Besides, 100 g of fresh grapes contain about 191 mg of health benefiting electrolyte, potassium.\n" + "\n" + "They are an also good source of vitamin-C, vitamin-A, vitamin-K, carotenes, B-complex vitamins such as pyridoxine, riboflavin, and thiamin.\n",
            "Green peas are a very good source of vitamin K, manganese, dietary fiber, vitamin B1, copper, vitamin C, phosphorus and folate. They are also a good source of vitamin B6, niacin, vitamin B2, molybdenum, zinc, protein, magnesium, iron, potassium and choline.",
            "Kale is high in vitamins K, A and C. Vitamin K is important for heart health, blot clotting, bone health, cancer prevention and diabetes prevention. Vitamin A helps support skin health and vision. Vitamin C is important for immune health and joint health, helps to keep the body hydrated and also increases your metabolism.",
            "Leeks contain notable quantities of vitamins A and K, along with healthy amounts of folic acid, niacin, riboflavin, magnesium, and thiamin. Adequate intake of leeks during pregnancy may help prevent neural tube defects in newborns. B vitamins in leeks, in particular, may support heart health by keeping levels of homocysteine in balance (elevated levels of homocysteine are associated with heart disease, blood clots, and stroke).",
            "Lemons are best when bright yellow and thin-skinned. Famous as a refreshing drink bearing its name, lemon slices or wedges are often added to cold and hot tea for an extra punch of vitamin C. They make a great garnish for salads and can be squeezed over other raw fruits to add flavor while preventing them from turning brown.",
            "Lettuce leaves are extremely nutritious. Their benefits can be called nothing short of being massive. They are high in minerals and vitamins and other essential nutrients. They come packed with benefits for skin, hair and health. They help solve a host of health problems and maintain your overall well-being.\n" +
                    "Lettuce is a rich source of vitamin A with six leaves providing more than 100% of your DV (daily value) of vitamin A. Vitamin A increases the cell turnover, thus revitalizing your skin (1). It is advised that you include lettuce leaves in your daily diet as much as you can.\n" +
                    "It also contains potassium which gives a rich supply of nutrients and oxygen by improving circulation, thus resulting in a healthy and glowing skin",
            "Did you know that one cup of mangoes has 100 calories? The same amount provides 100% of your daily vitamin C recommendation for promoting healthy immune function and collagen formation, and 35% of your vitamin A, important for vision, bone growth, and maintaining healthy mucous membranes and skin – plus, it’s shown by clinical studies to help protect your body from lung and mouth cancers.\n" +
                    "\n" +
                    "Besides having more than 20 different vitamins and minerals, mangos contain flavonoids like betacarotene, alphacarotene, and beta-cryptoxanthin, which help vitamin A to impart antioxidant strength and vision-protecting properties, maintaining healthy mucous membranes and skin.",
            "Fresh mint provides excellent flavoring for many foods. Because the herb adds flavor without sodium, it is especially beneficial if you have cardiovascular disease or high blood pressure. Try adding chopped mint to sauces for lean, red meats or to boiled vegetables including peas, green beans or new potatoes. It is also terrific in a raw, fresh vegetable salad, particularly with cucumber and tomato. Use mint as a garnish for cool summer drinks and in fruit desserts. Dried peppermint leaves make a refreshing tea that may also help to ease indigestion symptoms.",
            "White button mushrooms promote immune function by increasing the production of antiviral and other proteins that are released by cells while they are trying to protect and repair the body’s tissues. A later study showed that these mushrooms promoted the maturation of immune system cells-called dendritic cells-from bone marrow. According to he researchers, this may help enhance the body’s immunity leading to better defence systems against invading microbes.",
            " The fiber in okra has been linked to several benefits, such as optimal digestive function, low cholesterol levels, reduced heart disease risk, and weight management. Because fibrous foods are more challenging to digest, you’ll feel more satiated when you eat them.\n" +
                    "\n" +
                    "At the same time, okra is actually packed with nutrients. One of the key nutrients of this green crop is vitamin C – about 36 percent of the daily recommended amount. Increasing your intake of vitamin C-rich foods can help support your immune function, prevent free radical damage, and may help regulate blood pressure.",
            "Whether white, yellow, or red, onions are one of the world’s most popular and versatile vegetables, delivering an unmistakable, pungent heat – some more than others. They’re in demand for cold salads and hot soups, sliced in rings or solid disks on burgers, and chopped in relish. The delicious caramelization that takes place when onions are sautéed is due to their high sugar content. (Try them sautéed with bell peppers for a tasty fajita ingredient.) Spanish red onions are generally milder than white or yellow. The Vidalia variety is one of the sweetest.",
            "It's no surprise that the greatest nutritional appeal of the orange is its vitamin C content, comprising 165 percent of the recommended daily value in a one-cup serving. This is important for fighting off germs that cause colds and flu, and even builds your resistance to infection. With the \"C\" come powerful antioxidants that scavenge free radicals in the blood. Potassium is an important component of cell and body fluids that helps control heart rate and blood pressure.\n" +
                    "\n" +
                    "Calcium in oranges, besides aiding in the development of strong bones and teeth, also helps blood vessels distribute blood throughout the body while releasing hormones and enzymes that positively affect nearly every vital function of the body.",
            "Parsnips are a member of the Apaiaceae family, which also includes the carrot, dill, cumin, parsley and caraway. Parsnip has such a very strong resemblance to the carrot so much so that many confuse the two. The only difference is that carrot is typically orange, while parsnip has a lighter color hue.\n" +
                    "Parsnip is known for being a great source of soluble fiber, which can help reduce your bad cholesterol levels and risk of diabetes. In addition, it can help improve your digestive health by helping food move smoothly through your intestines, which can help reduce constipation and other common digestive disorders.",
            "Whatever type you use, pears are excellent for snacking, adding to garden salads, mixing with other fruits such as pineapples, peaches, or mangoes for a fruit salad. Overripe pears can be used in cooking and baking.\n" +
            "As good as pears are for you, the peeling is even better with nearly quadruple the phytonutrients, including beta-carotene, lutein, and zeaxanthin. Along with vitamin C and A, these compounds help keep the body protected from harmful free radicals.",
            "Sprouts are the perfect raw food. They are easy to grow, simple, and tasty to eat. SInce the agrarian era, people have been sprouting seeds because they offer dense nutrition and easy energy. No cooking is required, yet all the nutrients of the same seeds cooked are present in the sprout. In fact, minerals in many sprouted foods increase while fat content is lowered. And sprouts are full of the digestive enzymes needed for metabolism. When you eat sprouts, they literally digest themselves--leaving your body free to work on more important things!\n" +
                    "\n" +
                    "Sprouts are very versatile and can be made into delicious dishes from all over the world. Sprouted legumes can be made into anything from salads to dips to burger patties. Grain sprouts a can be transformed into moist, chewy breads with a dehydrator -- or just your oven set to Low. And leafy sprouts are a salad by themselves, and so good on a sandwich, in a pita, or stuffed into a veggie roll. With just a dash of spice or dressing a few handfuls of sprouts are transformed into a raw meal. Sprouts enhance the flavors and textures of many raw dishes.",
            "Many people tend to think of pumpkins as little more than just a Halloween decoration or a Thanksgiving pie filling, but maybe it is time to rethink this plump, nutritious orange plant.\n" +
                    "\n" +
                    "Pumpkin is an extremely nutrient-dense food, meaning it is chock-full of vitamins and minerals but low in calories.\n" +
                    "\n" +
                    "There are many creative ways pumpkin can be incorporated into meals, including desserts, soups, salads, preserves, and even as a substitute for butter. Next time pumpkin season comes around, don't carve it, cook it up and eat it. ",
            "Radishes regulate blood pressure, relieve congestion, and prevent respiratory problems such as asthma or bronchitis. They have antibacterial, antifungal, and detoxifying properties, and contain compounds that soothe rashes, dryness, and other skin disorders.\n" +
                    "\n" +
                    "Eating radishes can help in the removal of bilirubin, a condition evidenced by a yellow tinge in the skin, mucus membranes, or eyes, often present in newborns. This type of jaundice occurs when bilirubin builds up in bile faster than the liver can break it down and pass it through your body. Meanwhile, the beneficial properties in radishes also inhibit red blood cell damage by supplying fresh oxygen to your blood.",
            "Low in calories but packed with nutrients, spinach is one of a number of leafy vegetables becoming more and more prevalent on the salad bar. Its versatility makes it easily adaptable in healthy vegetable drinks and smoothies, lightly sautéed as a stand-along side dish, and added to soups or stir fried vegetables. Best of all, this green superfood is packed with so many healthy attributes, it’s hard to list them all!",
            "Spirulina has long been revered for its ability to strengthen the immune system. Because it actively promotes cell regeneration, it helps wounds heal quicker, and makes recovery from illnesses occur faster. Spirulina fortifies one's immune system, leaving the person less likely to experience colds, flus, and other contractible illnesses.\n" +
                    "It is also an excellent supplement for those looking to improve their eye health. This blue-green algae is very rich in vitamin A, and this vitamin is exceptionally important for healthy eyes. For this same reason, eating more carrots has long been recommended to those looking to improve their eye health, but spirulina actually has ten times the vitamin A concentration gram per gram of carrots.",
            "Squash is one of the most versatile and delicious vegetables available throughout the world, and it also packs a serious punch in terms of health and medicinal benefits. Different varieties of squash have the ability to improve the quality of your sight, boost skin health, strengthen the immune system, prevent cancer, manage symptoms of diabetes, build strong bones, protect heart health, reduce symptoms of insomnia, prevent inflammatory conditions, treat arthritis, eliminate ulcers, eliminate parasites and infections, increase prostate health, protects against birth defects, boosts respiratory health, and reduces blood pressure.",
            "If you’re not already a fan of strawberries, you should be. Not only are they juicy, summery and delicious, they’re a bona fide superfood, too. Nutrient-rich and packed with antioxidants (like vitamin C), strawberries offer a wide range of health benefits, some of which may surprise you....yes, including wrinkle prevention.\n" +
            "The antioxidant properties in strawberries may also help to prevent cataracts-the clouding over of the eye lens-which can lead to blindness in older age. Our eyes require vitamin C to protect them from exposure to free-radicals from the sun’s harsh UV rays, which can damage the protein in the lens. Vitamin C also plays an important role in strengthening the eye’s cornea and retina. While high doses of vitamin C have been found to increase the risk of cataracts in women over 65, researchers from the Karolinska Institutet in Stockholm note that the risk pertains to vitamin C obtained from supplements, not the vitamin C from fruits and vegetables.",
            "One of the best ways to enjoy the nutrition of a sunflower is by eating its sprouts. Sunflower sprouts boast a surprising 25 percent protein. They are also rich in stress-busting vitamin B and hormone-balancing zinc. Their sweet taste and hearty texture make a great addition to any salad.\n" +
            "Did you know that sunflower seeds and their sprouts contain high amounts of zinc. Zinc is a well-researched mineral that is essential for the development of sperm, which is why it is especially important for men.",
            "Sweet potatoes are naturally sweet-tasting but their natural sugars are slowly released into the bloodstream, helping to ensure a balanced and regular source of energy, without the blood sugar spikes linked to fatigue and weight gain.",
            " If you have not been experimenting with Swiss chard in the kitchen, now is the time to start. Like it's wildly popular green cousin kale, Swiss chard packs a powerful nutritional punch, providing over 700% of your daily needs for vitamin K and over 200% of daily vitamin A needs in just one cup.\n" +
                    "\n" +
                    "Swiss chard is also commonly known as silverbeet, spinach beet, perpetual spinach, crab beet and mangold. Along with other leafy greens and descendants of the beet family, Swiss chard contains high levels nitrates, which been shown to lower blood pressure, reduce the amount of oxygen needed during exercise and enhance athletic performance.",
            "Tangerines, also known as mandarin oranges, are a tasty and refreshing citrus fruit packed with many nutritious compounds, including flavonoids, vitamin C, vitamin A, folate and potassium. These healthful components contribute to the health of all parts of the body, from cell DNA to the bones and heart.",
            "The health benefits of tofu as a meat substitute are numerous. Consuming tofu regularly helps lower bad cholesterol, alleviates symptoms associated with menopause and even lowers the risk of cancer. Other major health benefits of tofu compared to meat include making middle-aged bones stronger and delaying the ravages of age. Tofu has been found to be a great source of calcium and vitamin E as well. Tofu or soybean curd is produced by grinding soybeans to form a milk-like substance, which is then compressed and left to coagulate. After the mass has dried into a gelatinous solid, it is cut into palm-sized cubes. Since soybean is cheap and abundant, but rich in protein, the popularly known benefit of tofu is that of being the \"poor man's protein.\"",
            "Tomatoes contain a great deal of Vitamin A and Vitamin C. This is primarily because these vitamins and beta-carotene work as antioxidants to neutralize harmful free radicals in the blood.\n" +
                    "Free radicals in the blood stream are dangerous because it may lead to cell damage. Remember, the redder the tomato you eat is, the more beta-carotene it contains. In addition, you also want to keep in mind that cooking destroys the Vitamin C, so for these benefits, the tomatoes need to be eaten raw.",
            "Turmeric has long been used as a stomach soother, and is particularly useful for constipation, cramping, and irritable bowel syndrome. The anti-inflammatory activity of curcumin also comes into play here, as it lowers the chances of developing ulcers, bleeding in the bowels, and generally eliminates irritation throughout the gut. Turmeric is often recommended for patients suffering from Inflammatory Bowel Disease and even more serious conditions, such as Crohn’s disease. The dietary fiber content found in turmeric, although not off the charts, is still significant and can help smooth your digestive processes.\n" +
                    "\n" +
                    "Menstrual Issues: If you suffer from severe menstrual discomfort, cramping, bloating, excessive bleeding, or mood swings, turmeric may be precisely what you’ve been looking for. The anti-inflammatory and soothing nature of the herb’s natural compounds can relieve most symptoms of menstruation.",
             "", "","","","","",};

/*===============================================ARRAY OF  TITLE FOR EACH MOVIE==================================================*/

    String[] titles ={"Apples", "Apricots", "Artichokes", "Asparagus", "Avocadoes", "Bananas", "Beets", "Broccoli", "Brussel Sprouts", "Cabbages", "Cantaloupe", "Carrots", "Cauliflower", "Celery", "Coconut Water", "Coriander", "Corn", "Courgettes", "Cow peas", "Cranberries", "Cucumber", "Dates", "Eggplant", "Figs", "Garlic", "Grapefruit", "Grapes", "Green peas", "Kales", "Leeks", "Lemon", "Lettuce", "Mango Fruit", "Mint", "Mushrooms", "Okra", "Onions", "Orange Fruit", "Parsnips", "Pears", "Pea sprouts", "Pumpkins", "Radishes", "Spinach", "Spirulina", "Squash", "Strawberry", "Sunflower sprouts", "Sweet Potatoes", "Swiss Chard", "Tangerine", "Tofu", "Tomatoes", "Turmeric", "Water Chestnuts", "Watercress", "Watermelon", "Wheat Grass", "Yam", "Zucchini"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        img = (ImageView) findViewById(R.id.img);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvSample = (TextView) findViewById(R.id.tvSample);

        int position = getIntent().getIntExtra("data", 0);
        //String names = getIntent().getStringExtra("names");
        img.setImageResource(images[position]);
        tvTitle.setText(titles[position]);
        tvSample.setText(desc[position]);
    }
}