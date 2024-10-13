package com.example.news

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter=BlogAdapter(getBlogs())
        recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(this)

    }
    fun getBlogs(): List<Blog> {
        val blogs = ArrayList<Blog>()
        blogs.add(
            Blog(
                "This Is the Most Popular Living Room Paint Color for 2024",
                R.drawable.image1,
                "3/10/2024",
                "by Abby Monteil",
                "Choosing a color palette for your home can make the difference between a relaxing, organized space and a cluttered and busy one. But it can be intimidating to decide on color combinations for all the different areas of your home, especially when the decision can feel so permanent. (Once you decide to paint a room, who hasn’t been gripped with terror at the thought of changing their mind?) What works for a home office might not necessarily be a great fit for the dining room, and the colors that go with green might not exactly match the colors that go with gray. It’s tough to choose!\n" +
                        "\n" +
                        "So to best understand which paint colors are most popular per room among U.S. homeowners, the team at Level Frames used Google Keyword Planner between the months of August 2023 and July 2024 to gather U.S. search data for terms like “home decor colors” and “living room decor colors.”\n" +
                        "\n" +
                        "Here’s what they found: When it comes to overall home decor colors, magnolia is at the top of the list. Over the past year, U.S. homeowners searched for the buttery-yellow color over 55,000 times. \n" +
                        "\n" +
                        "Designer Autumn Hachey previously told Apartment Therapy earlier this year that butter yellow is a great way to casually integrate more color into your home without completely abandoning the flexibility of neutral tones.\n" +
                        "\n" +
                        "“For several years, neutrals took over, and homes felt tonal and beige,” Hachey said. “Now, people are craving color. Yellow is a beautiful, bright color that feels opposite to beige in terms of energy, but in a buttery tone, it still feels safe to explore.”",
            "5 min"))
blogs.add(Blog(
    "I’m in My Divorced Mom Core Era, and It’s Totally Changed My Life",
    R.drawable.image2,
    "Oct 3, 2024",
    "by Sassafras Patterdale",
    "I’m a big believer in being unapologetically yourself, no matter what. For me this is true about how I walk through the world, and also how I decorate my home. Like many LGBTQ+ teenagers, I became homeless after I came out. Even now, at 40, the memory of that experience is never far from the surface. There is nothing more important to me than creating a home. \n" +
            "\n" +
            "Now, being a homeowner is an incredible privilege I never take for granted, but my relationship with what my home looks like has changed a lot. Sometimes a big life event changes everything about the life you thought you had, and this year, I found myself embracing the “Divorced Mom Core” aesthetic thanks to one of those. \n"+ "The viral “Divorced Mom Core” aesthetic is captivating the internet, and with good reason. After all, who isn’t tired of living life by other people’s priorities or aesthetics? This trend is all about not compromising and making your home unapologetically what you love regardless of how “cool” or “trendy” it is. The name comes from seeing women who, after years of marriage and kids, move into their own place and decorate exactly according to their taste, without making concessions to anyone else. \n" +
            "\n" +
            "Despite the name, #DivorcedMomCore isn’t just for moms going through a divorce. People of all ages, genders, and lived experiences who are going through a big life change can find themselves in this aesthetic. I’m not a mom — I’m a queer, nonbinary, child-free person whose life revolves around their dogs, and I totally feel represented by this. ",
"7 min"
))
        blogs.add(Blog(
            "Bold & Beautiful: 7 Orange Two-Colour Combinations for Bedroom Walls"
            ,R.drawable.image3,
            "September 29, 2024",
            "by Agniva Banerjee",
            "Explore seven creative orange two-colour combinations for bedroom walls\n" +
                    "\n" +
                    "Embrace your inner diva by splashing your walls with a sunny palette that brightens your entire space. Are you ready to add a pop of personality to your bedroom walls? Orange, the colour of joy and enthusiasm, is the perfect hue to breathe life into your sleeping space. \n" +
                    "\n" +
                    "Let’s embark on a refreshing citrusy journey and discover how pairing orange with complementary shades can create a harmonious and visually stunning backdrop for your bedtime narratives. Get ready to turn your bedroom into a vibrant oasis that reflects your unique style with these seven orange two-colour combination walls.\n" +
                    "\n" +
                    "Modern Orange Colour Combination for Bedroom Walls With Gradient Hues\n" +
                    "Turn your bedroom into a modern masterpiece with gradient hues of orange adorning the walls. This vibrant colour combination with orange wall not only adds a contemporary touch but also enhances functionality. \n" +
                    "\n" +
                    "The subtle transition from lighter to deeper shades creates a dynamic and visually captivating backdrop, perfect for sparking conversations. Infuse your space with warmth and style as you embrace the versatility and charm of modern orange colour combinations for your bedroom walls.",
        "7 min"
        ))
        blogs.add(Blog(
            "I Got a Color Analysis for My Home Decor and It Was Not At All What I Was Expecting",
            R.drawable.image4,
            "Oct 2, 2024",
            "by Daniela Araya",
            "If you were to ask me how many different colors I have in my home, I honestly couldn’t tell you. In my living room alone, I can spot over 15 shades among the walls, furniture, and decor (I promise it’s not as overwhelming as it sounds!).\n" +
                    "\n" +
                    "That number might make some people cringe — especially because we’re often told to keep things simple when decorating, and to stick to a palette of maybe five or six shades. While I’ve definitely started some projects with that mindset, I’ve always felt color should be about freedom — not rules. My home is proof of that: It’s filled with vibrant hues that make me feel energized and happy./n"+"Then I did something unexpected: I got a color analysis. Yes, the rainbow-fabric-floating-by-your-head thing that tells you which colors supposedly make you look your best. And it got me thinking: Could this same approach work in home design, too?\n" +
                    "\n" +
                    "For those unfamiliar, color analysis is all about finding the shades that complement your skin tone, hair, and eyes. Without getting too technical, it’s done by examining the value, hue, and chroma coloring in your features (what kind of undertones you have, how muted or vibrant your hair color is, etc.) and then homing in on your specific “color season” or palette. I got to experience the entire process firsthand when I met Dana Hammond, founder of Colorful Style by Dana, in the Hudson Valley.",
            "5 min"))
   blogs.add(Blog(
       "11 Types of Curtains to Take Your Home From Prim to Polished",
       R.drawable.image5,
       "September 27, 2024",
       "by Shraddha Desai",
       "Different types of curtains may add a finishing touch to a room or window, but it’s incredible how they also have qualities that can completely change your room! Curtains serve more purposes than just providing privacy and filtering sunlight. The curtain world is vast and varied, from elegant drapes screaming luxury to breezy sheers whispering tranquility.\n" +
               "\n" +
               "Read on to explore different types of curtains and learn how to choose a style that perfectly complements your home. \n" +
               "\n" +
               "1. Holdback Types of Curtains for Elegant Control \n" +
               "Opt for holdback curtains if you are looking for different types of curtains and want to give your room or window a makeover. These curtains offer style and functionality and can make the living room and balcony look more beautiful. They can also be tied, giving your room a neat look. This technique will give your window treatment or space an appealing look while stopping the fabric from blocking views or sunshine.\n" +
               "\n" +
               "These types of drapes are used more in the living room than just beautifying windows. Holdback curtains serve as classy room dividers, segregating varied spaces within an open-plan area. For instance, they can separate your home office from the living room. The remarkable thing about holdback curtains is that they make the room appear broader when tied back.\n" +
               "\n" +
               "These curtains are also perfect for a balcony, allowing a harmonious blend of light and privacy. When tied back, holdback curtains let in lots of sunlight and breeze. You can hang string lights on these curtains to enhance the overall look further. The string lights glow with curtains against the night sky, setting up a warm and cosy mood, making the balcony an inviting spot for evening relaxation or inviting guests for a night party. /n" + "2. Blackout Types of Drapes: Block Light in Style\n" +
               "Blackout curtains are perfect for your bedroom. They offer a light-control solution, and their thick material absorbs sound and creates a peaceful environment. The material for these curtains comes in several shades and textures, fitting well with traditional and modern interior designs./n" + "3. Pinch Pleated Types of Curtains for Home: A Timeless Classic\n" +
               "These are an excellent option for those looking to maintain a classic look inside the home. Because the pleats on the top of the curtain are stitched and pressed, the pinch-pleated curtain has a structured appearance.   \n" +
               "\n" +
               "One of their exciting features is that they can be customised with two to five pleats. More pleats make the room appear luxurious and look as good in bedrooms as in halls or dining areas. Another fabulous feature of these types of curtains is their fabric versatility. Pinch pleat curtains enhance the fabric’s natural drape, whether you choose lightweight sheers to produce a breezy effect or heavy velvet for a dramatic draping effect. They would go well with various curtain rods and glide smoothly, making them easy to open and close on a pull without a fuss. ",
       "4 min"
   ))
        blogs.add(Blog(
            "7 Gorgeous Mirror Designs with Lights to Illuminate Your Home",
            R.drawable.image6,
            "September 26, 2024",
            "by Agniva Banerjee",
            "Question: Mirror, mirror on the wall, who’s the most versatile of them all? \n" +
                    "\n" +
                    "Answer: A fancy mirror design with lights always stands out! \n" +
                    "\n" +
                    "Do you like to add a hint of style and functionality to your space? From living rooms to bathrooms and dressing tables, the fusion of mirrors and lights provides adequate illumination for tasks like grooming, makeup application, or styling hair, especially in dimly lit spaces. They can make a space appear larger and more inviting. Let’s flip the switch on conventional mirrors and explore the grand luminosity. Here are seven creative mirror light design solutions for a space glow-up.\n" +
                    "\n" +
                    "1. Full-Length Bedroom Mirror Design With Lights\n" +
                    "A full-length bedroom mirror design with lights serves the dual purpose of saving space and enhancing beauty. By integrating lighting directly into the mirror, this design eliminates the need for additional floor or wall lamps, thus conserving space in the room. Simultaneously, the added illumination accentuates the mirror’s reflective surface, amplifying its beauty and making it the beauty spot of the bedroom.\n" +
                    "\n" + "2. Fuse Form and Function: LED Modern Mirror Design With Lights\n" +
                    "Feel like a diva when you dress up! Use an LED modern mirror with lights to elegantly blend form and function. This design not only fulfils a functional need by providing lighting for grooming activities but also gives the area a modern touch with its sleek and simple appearance. ",
        "5 min"
        ))
                    blogs.add(Blog(
    "8 Exquisite Coffee Bar Ideas for Your Home You Can Create This National Coffee Day",
    R.drawable.image7,
    "September 20, 2024",
    "by Juhi Advani",
    "We love coffee, too! Here are eight stunningly hot coffee bar ideas with pictures for your home. Read here. \n" +
            "\n" +
            "Coffee lovers! We share your appreciation for the comforting shades of coffee brown in interior design, the sheer delight of waking up to the aroma of freshly roasted beans, and, of course, having a dedicated coffee corner – or shall we say, a ‘coffee bar’ – right in the comfort of your home.\n" +
            "\n" +
            "Take a look at our stylish coffee bar ideas for home through this carefully brewed blog just for you. Coming right up- eight coffee station ideas tailor-made for your home!\n" +
            "\n" +
            "1. Breakfast Table With Coffee Bar Ideas for Quick Meals\n" +
            "Let’s talk about convenience, space-saving, and modern kitchen designs! This minimalistic kitchen features an in-built breakfast counter, allowing you to prepare and enjoy hot meals from pan to plate within minutes. But that’s not all; this versatile counter is a perfect cosy coffee bar idea for small spaces. Brew your favourite coffee while your toast gets done. \n" +
            "\n" +
            "To enhance functionality and aesthetics, consider adding wall-mounted shelves. These provide more storage space and create an elegant display for your coffee station essentials, and more.\n" +
            "\n" +
            "Bonus Tip: Place a bowl of coffee beans on top for a delightful aroma that fills your space.",
"6 min"
        ))
        blogs.add(Blog(
            "10 Exquisite Glass Wall Designs Inspiring Modern Interiors",
            R.drawable.image8,
            "September 19, 2024",
            "by Agniva Banerjee",
            "Let the light in and style shine with these ten elegant glass wall designs.\n" +
                    "\n" +
                    "Let’s break the walls down and breathe some regal ideas into your interiors! Glass walls have become the new superheroes of interior design, swooping in with style, sophistication, and a whole lot of natural light. \n" +
                    "\n" +
                    "They are like the fairy godmothers of modern homes, granting wishes for spaciousness, connectivity with nature, and that oh-so-chic factor. So, if you are ready to add a touch of brilliance to your abode, buckle up as we journey through 10 elegant glass wall designs that will make you rethink what it means to live in luxury. Read on!\n" +
                    "\n" +
                    "Upgrade Style With a Luxurious Glass Wall Design for the Living Room \n" +
                    "Elevate your living room to new heights of sophistication with a luxurious glass wall design integration. This mirror-like installation reflects your refined taste and style and opens your interiors to modern elegance. The L-shaped couch and the massive artwork on the floor add the cherry to the cake./n" +"Glass Wall Panels for an Unrestricted View\n" +
                    "Unleash the beauty of boundless vistas with sleek glass wall panels. Level up your space into an oasis of light and openness, blurring the lines between indoors and outdoors for an unparalleled experience of modern living. \n" +
                    "\n" +
                    "This modern living room looks chic with an ivory-coloured couch and a floor lamp in the same colour. The two black coffee tables provide a contrast. It’s a gorgeous living room, we think! ",
            "4 min"
        ))
        blogs.add(Blog(
            "Nail the Bedroom Bookshelf With 10 Gorgeous Ideas",
            R.drawable.image9,
            "September 17, 2024",
            "by Agniva Banerjee",
            "Read yourself and sleep in style with these 10 inspiring bedroom bookshelf ideas\n" +
                    "\n" +
                    "Good book. Lazy days. Feel like staying in bed a whole day? This is like every book lover’s dream come true! We suggest some amazing bookshelf solutions for the bedroom so that you can cosy up your space and snuggle with a good read. It’s time to banish the clutter and upgrade your home with stylish and functional bedroom bookshelf ideas. \n" +
                    "\n" +
                    "Say goodbye to scattered books and hello to organised bliss! Here’s to transforming your nighttime routine into a seamless blend of relaxation and literary delight. Read on & explore ten innovative bedroom bookshelf ideas specifically crafted to enhance your relaxed reading experience. \n" +
                    "\n" +
                    "1. All-In-One Solution: Bookshelf Ideas for Small Bedroom\n" +
                    "Optimise small space with a multifunctional study table and built-in bedroom bookshelf design. This ingenious solution merges workspace and storage, ideal for compact rooms. Maximise efficiency without sacrificing style, accommodating bedside reads effortlessly. ",
            "6 min"
        ))
        blogs.add(Blog(
            "Style Within Budget: 7 Trendy Wall Stickers For Bedroom",
            R.drawable.image10,
            "September 11, 2024",
            "by Juhi Advani",
            "Express your style through trendy bedroom wall stickers.\n" +
                    "\n" +
                    "Your bedroom walls are waiting to be beautified. A modern design solution is ready to transform your room like never before, and that too within budget. Don’t hold back—wall stickers for bedrooms are the new cool. Are you thinking of a retreat-like brick wall design? A subtle floral look? Or your son’s favourite football theme for his bedroom? We’ve got you covered! Read on to know more.\n" +
                    "\n" +
                    "1. Go all out: Full Wall Stickers for Bedroom \n" +
                    "Why hesitate when one can entirely transform those empty walls with full wall stickers? Do you enjoy larger-than-life themes like abstract art, cityscapes, or a world map? Then stickers that cover the entire wall area are for you!\n" +
                    "\n" +
                    "Look at this stunningly put-together bedroom with minimalist furniture and the spectacle—a world map wall sticker. Calling globetrotters and travel lovers, this is your chance to showcase your love for your dream destination. How wonderful it is to wake up to education, motivation and inspiration! /n"+"2. Set the Mood: Romantic Wall Stickers for Bedroom \n" +
                    "Candles, roses, date nights, comfy linens, and perhaps a dreamy wallpaper? Take a look at this bedroom featuring a passionate wall sticker of a couple using a black silhouette. It’s clever and romantic and adds a touch of intimacy to the bedroom. Not your style? Check out other romantic wall stickers like moonlit landscapes, starry nights, romantic quotes and poems, heartbeat stickers and much more!",
            "6 min"
        ))
        blogs.add(Blog(
            "Top 5 Reasons to Choose Fluted Glass Doors for Your Home",
            R.drawable.image11,
            "September 7, 2024",
            "by Agniva Banerjee",
            "Upgrade your home with fluted glass doors\n" +
                    "\n" +
                    "Imagine walking into a room where elegance meets functionality, where light dances through textured glass, creating a serene and inviting atmosphere. This is the magic of fluted glass doors. \n" +
                    "\n" +
                    "Whether revamping your kitchen, enhancing your bathroom, or adding a touch of sophistication to your pooja room, these doors offer a blend of style and practicality. From using them in kitchens as cabinet doors or for wardrobes, these versatile design elements can transform your home into a modern sanctuary. \n" +
                    "\n" +
                    "Let’s explore the top reasons why fluted glass doors are the perfect addition to any living space:\n" +
                    "\n" +
                    "1. A Fluted Glass Door With Wooden Frame Enhances Aestheticism\n" +
                    "A fluted glass door with a wooden frame adds a touch of elegance and sophistication to your living room. The combination of textured glass and natural wood creates a stunning focal point, enhancing the room’s aesthetic appeal while maintaining a warm and inviting atmosphere.",
            "6 min"
        ))
        blogs.add(Blog(
            "Bold and Beautiful: 9 Creative Ways to Pair Red with Other Colours",
            R.drawable.image12,
            "September 6, 2024",
            "by Pallabi Bose",
            "Transform your home with 9 red colour palettes that are sure to amaze you.\n" +
                    "\n" +
                    "Choosing the right colour scheme for your new home can be daunting, especially when considering bold choices like red. Red is a powerful, dynamic colour that can add energy, warmth, and sophistication to any room. However, it can also be tricky to pair with other colours without overwhelming the space. Fret not! This blog will guide you through 15 creative red colour combinations for your home interior, showcasing how different shades and combinations can create a balanced and inviting atmosphere. Read on!\n" +
                    "\n" +
                    "The Eclectic Kitchen in Red Colour Combination\n" +
                    "The red upper cabinets add a lively touch to this eclectic kitchen, contrasting beautifully with the neutral grey and white tones. The choice of colours creates a balanced yet energetic space. Additionally, the quirky wall art in bright colours infuses a playful vibe into this kitchen, making it a fun and inviting space to cook and entertain.",
            "5 min"
        ))
        blogs.add(Blog(
            "10 Exquisite Glass Wall Designs Inspiring Modern Interiors",
            R.drawable.image13,
            "September 19, 2024",
            "by Agniva Banerjee",
            "Let the light in and style shine with these ten elegant glass wall designs.\n" +
                    "\n" +
                    "Let’s break the walls down and breathe some regal ideas into your interiors! Glass walls have become the new superheroes of interior design, swooping in with style, sophistication, and a whole lot of natural light. \n" +
                    "\n" +
                    "They are like the fairy godmothers of modern homes, granting wishes for spaciousness, connectivity with nature, and that oh-so-chic factor. So, if you are ready to add a touch of brilliance to your abode, buckle up as we journey through 10 elegant glass wall designs that will make you rethink what it means to live in luxury. Read on!\n" +
                    "\n" +
                    "Upgrade Style With a Luxurious Glass Wall Design for the Living Room \n" +
                    "Elevate your living room to new heights of sophistication with a luxurious glass wall design integration. This mirror-like installation reflects your refined taste and style and opens your interiors to modern elegance. The L-shaped couch and the massive artwork on the floor add the cherry to the cake./n" +"Glass Wall Panels for an Unrestricted View\n" +
                    "Unleash the beauty of boundless vistas with sleek glass wall panels. Level up your space into an oasis of light and openness, blurring the lines between indoors and outdoors for an unparalleled experience of modern living. \n" +
                    "\n" +
                    "This modern living room looks chic with an ivory-coloured couch and a floor lamp in the same colour. The two black coffee tables provide a contrast. It’s a gorgeous living room, we think! ",
            "6 min"
        ))
        blogs.add(Blog(
            "10 Exquisite Glass Wall Designs Inspiring Modern Interiors",
            R.drawable.image14,
            "September 19, 2024",
            "by Agniva Banerjee",
            "Let the light in and style shine with these ten elegant glass wall designs.\n" +
                    "\n" +
                    "Let’s break the walls down and breathe some regal ideas into your interiors! Glass walls have become the new superheroes of interior design, swooping in with style, sophistication, and a whole lot of natural light. \n" +
                    "\n" +
                    "They are like the fairy godmothers of modern homes, granting wishes for spaciousness, connectivity with nature, and that oh-so-chic factor. So, if you are ready to add a touch of brilliance to your abode, buckle up as we journey through 10 elegant glass wall designs that will make you rethink what it means to live in luxury. Read on!\n" +
                    "\n" +
                    "Upgrade Style With a Luxurious Glass Wall Design for the Living Room \n" +
                    "Elevate your living room to new heights of sophistication with a luxurious glass wall design integration. This mirror-like installation reflects your refined taste and style and opens your interiors to modern elegance. The L-shaped couch and the massive artwork on the floor add the cherry to the cake./n" +"Glass Wall Panels for an Unrestricted View\n" +
                    "Unleash the beauty of boundless vistas with sleek glass wall panels. Level up your space into an oasis of light and openness, blurring the lines between indoors and outdoors for an unparalleled experience of modern living. \n" +
                    "\n" +
                    "This modern living room looks chic with an ivory-coloured couch and a floor lamp in the same colour. The two black coffee tables provide a contrast. It’s a gorgeous living room, we think! ",
            "3 min"
        ))
        blogs.add(Blog(
            "10 Exquisite Glass Wall Designs Inspiring Modern Interiors",
            R.drawable.image15,
            "September 19, 2024",
            "by Agniva Banerjee",
            "Let the light in and style shine with these ten elegant glass wall designs.\n" +
                    "\n" +
                    "Let’s break the walls down and breathe some regal ideas into your interiors! Glass walls have become the new superheroes of interior design, swooping in with style, sophistication, and a whole lot of natural light. \n" +
                    "\n" +
                    "They are like the fairy godmothers of modern homes, granting wishes for spaciousness, connectivity with nature, and that oh-so-chic factor. So, if you are ready to add a touch of brilliance to your abode, buckle up as we journey through 10 elegant glass wall designs that will make you rethink what it means to live in luxury. Read on!\n" +
                    "\n" +
                    "Upgrade Style With a Luxurious Glass Wall Design for the Living Room \n" +
                    "Elevate your living room to new heights of sophistication with a luxurious glass wall design integration. This mirror-like installation reflects your refined taste and style and opens your interiors to modern elegance. The L-shaped couch and the massive artwork on the floor add the cherry to the cake./n" +"Glass Wall Panels for an Unrestricted View\n" +
                    "Unleash the beauty of boundless vistas with sleek glass wall panels. Level up your space into an oasis of light and openness, blurring the lines between indoors and outdoors for an unparalleled experience of modern living. \n" +
                    "\n" +
                    "This modern living room looks chic with an ivory-coloured couch and a floor lamp in the same colour. The two black coffee tables provide a contrast. It’s a gorgeous living room, we think! ",
        "5 min"
            ))
        return blogs
    }
}