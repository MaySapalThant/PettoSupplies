-- MySQL dump 10.13  Distrib 5.5.15, for Win32 (x86)
--
-- Host: localhost    Database: pet_supplies
-- ------------------------------------------------------
-- Server version	5.5.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) NOT NULL,
  `admin_email` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL,
  PRIMARY KEY (`admin_id`),
  UNIQUE KEY `admin_id` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
INSERT INTO `admins` VALUES (1,'May Sapal Thant','admin@gmail.com','admin12345');
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categories` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) NOT NULL,
  `pet_id` int(11) NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_id` (`category_id`),
  KEY `pet_id` (`pet_id`),
  CONSTRAINT `categories_ibfk_1` FOREIGN KEY (`pet_id`) REFERENCES `pets` (`pet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Dog Foods',25),(2,'Dog Beds & Funiture',25),(7,'Dog Health and Wellness',25),(8,'Cat Foods',26),(10,'Cat Beds and Funiture',26),(15,'Cat Toys',26),(16,'Cat Health and Wellness',26),(17,'Fish Foods',35),(18,'Aquariums',35),(19,'Aquarium Decorations',35);
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(255) NOT NULL,
  `customer_email` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `address` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (14,'Noé Archiviste','test@gmail.com','09-43434300','test1234','Vampire Street, Paris'),(16,'ByunBaekHyun','baek@gmail.com','09-8798797987','baek12345','No. 04, Eri street, Bucheon, South Korea'),(19,'Dazai Osamu','test2@gmail.com','09-8798797987','test12345','Bangou street, Tokyo'),(20,'Shison Jun','test3@gmail.com','09-11111210','test12345','No.162, Abc street, Osaka');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) NOT NULL,
  `description` varchar(2000) DEFAULT NULL,
  `unit_price` int(11) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `cart_qty` int(11) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `item_image` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `item_id` (`item_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `items_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'IAMS PROACTIVE HEALTH Small Kibble High Protein Dry Dog Food','Your dog is one-of-a-kind... that\'s why IAMS makes a dry dog food that\'s just as unique as they are. IAMS Adult Minichunks Small Kibble Dry Dog Food with Real Chicken gives your lovable adult dog the nutrition they need in the small kibble size they prefer. With real, farm raised chicken as the first ingredient, this adult dog food supports healthy digestion with a wholesome blend of fibers and prebiotics.',3600,4,1,1,'images/Iamso_front.jpg'),(2,'Kibbles \'N Bits Original Savory Beef & Chicken Flavors Dry Dog Food','The new kibble blend of Kibbles \'n Bits Original dry dog food features the same variety of tastes and textures that gets tails wagging! This antioxidant-rich, healthy dog food contains high-quality ingredients including vegetables and 23 essential vitamins & minerals. And it has the signature mix of crunchy kibble and meaty bits, making a delicious meal with complete and balanced nutrition that you can feel good about serving every day!',3300,0,0,1,'images/kibble_bits_front.jpg'),(9,'Blue Buffalo Life Protection Natural Adult Dry Dog Food, Chicken and Brown Rice','The Natural Formula for your dog which is the dry dog food features. This antioxidant-rich, healthy dog food contains high-quality ingredients including vegetables and 23 essential vitamins & minerals. And it has the signature mix of crunchy kibble and meaty bits, making a delicious meal with complete and balanced nutrition that you can feel good about serving every day.And this is the same variety of tastes and textures that gets tails wagging! ',5400,9,1,1,'images/blue_buffalo_front.jpg'),(10,'Furhaven Pet Bed for Dogs  - Two-Tone Faux Fur and Suede L-Shaped Dog Bed','Pamper your pet with a Furhaven Deluxe Orthopedic Two-Tone Plush Faux Fur & Suede L Shaped Chaise Lounge Sofa-Style Living Room Corner Couch Pet Dog Bed! A luxuriously soft faux fur sleep surface is complemented by suedine covered bolsters and gusset. Ultra-plush, flecked faux fur provides a snuggly soft sleep surface and trims the edges of the bolster for a chic flair. The two-tone design hides dirt and pet dander better than traditional plush sleep surfaces. The L shaped bolsters support your pet\'s back and hips, providing additional support.',24000,9,0,2,'images/Furhaven Pet Bed.jpg'),(11,'Coolaroo The Original Cooling Elevated Pet Bed','The Original Coolaroo Elevated Pet Bed\'s off-the-ground design and breathable fabric resting surface will keep your pet cool by increasing air flow to its fur coat, and comfortable by reducing stress on its joints and pressure points. The lightweight, powder-coated steel frame will last through the tough outdoor elements and the fabric is easy to clean, simply clean with water - for deeper clean use mild cleanser. This 100% recyclable fabric is GREENGUARD certified and is free of harmful lead and phthalate chemicals. ',21400,9,0,2,'images/Coolaroo Dog Bed.jpg'),(12,' Gray Dog Bed Comfortable Bolster Fits a 22-Inch Dog Crate Easy Maintenance','MidWest Homes for Pets is proud to offer the Quiet Time Bolster Gray Pet Beds to provide your dog or cat with a soft, cozy & welcoming place to rest & relax. These comfortably padded pet beds are ideal for most standard folding metal dog crates, dog carriers, cat carriers, dog houses and work great as a stand-alone dog bed / cat bed anywhere in the house or when traveling with your pet. Each Gray pet bed is made of polyester synthetic fur with overstuffed bolsters around the perimeter creating a nice headrest adding to your dog or cats overall comfort. ',8000,10,0,2,'images/Gray Dog Bed.jpg'),(13,'Nutramax Cosequin Maximum Strength Joint Health for Dogs','Only COSEQUIN is COSEQUIN. COSEQUIN Joint Health Supplement Plus MSM contains FCHG49 Glucosamine Hydrochloride, TRH122 Sodium Chondroitin Sulfate, and MSM (Methylsulfonylmethane). This combination of ingredients helps maintain your dog\'s cartilage and connective tissue. COSEQUIN supplements have been used since 1992 in animals to maintain joint health. COSEQUIN supplements have been shown safe, effective.',4000,10,0,7,'images/Nutramax Cosequin Dog health.jpg'),(14,'Veterinary Formula Clinical Care Antiseptic and Antifungal Spray for Dogs','Veterinary Formula Clinical Care Antiseptic and Antifungal Medicated Spray with chlorhexidine gluconate deodorizes and helps relieve fungal and bacterial skin infections on cats and dogs such as bacterial pyoderma and allergic or fungal dermatitis. This antibacterial spray for cats and dogs works fast to help relieve any outburst or infection on your dog or cat\'s skin, with symptoms including itchiness, pustules, loss of hair, greasiness, and/or scaly skin.',2000,7,0,7,'images/Veterinary Formula Clinical Care Dog health.jpg'),(15,'Vet\'s Best Aspirin Free Aches and Pains Dog Supplement- 50 Chewable Tablets','Relief for pets experiencing discomfort in their muscles and joints. Relief for pet parents who want an all-natural solution to help very active dogs and senior dogs feel better. Vet\'s Best Aspirin Free Aches & Pains Dog Supplements combine quality, natural anti-inflammatories -- such as Glucosamine HCL, Pineapple Bromelain, MSM, and White Willow Bark -- for quick pain relief.',3000,10,0,7,'images/Aspirin Free Aches and Pains Dog health.jpg'),(16,'Meow Mix Original Choice Dry Cat Food','Meow Mix Original Choice Dry Cat Food is specially formulated to help adult cats stay healthy and happy. This dry food for cats is the perfect mix to help you connect with your cat over a healthy meal. To maintain wellness throughout adulthood, fully grown cats need the proper nutrition to keep them in top shape as they age. Meow Mix Original Choice provides all the essential nutrients your cat needs, including high-quality premium protein and essential fatty acids.',4400,10,0,8,'images/Meow Mix Cat food.jpg'),(17,'Purina Friskies Dry Cat Food, Seafood Sensations 22 lb. Bag','Pour a purr-worthy dish full of yum with Purina Friskies Seafood Sensations dry cat food. Ocean fish, salmon, tuna and crab flavors combine to create a taste she\'ll love, and a touch of seaweed balances out this Purina dry cat food for delicious goodness. Essential vitamins and minerals in every serving let you feel good about offering this dry cat food to your feline friend, and the seafood flavors give her plenty of reasons to finish every last delectable bite.',5000,10,0,8,'images/Purina Friskies Dry Cat Food.jpg'),(18,'Purina Fancy Feast Gravy Wet Cat Food Gravy Lovers Poultry & Beef Feast Collection','Offer your discerning cat the gourmet tastes she loves with Purina Fancy Feast Gravy Lovers Poultry and Beef Feast Collection wet cat food. Chicken, turkey and beef give this collection the savory taste she craves, and the rich gravy in every serving of this canned cat food is sure to have her licking her dish clean. With essential vitamins and nutrients to support her overall health and wellness.',3100,10,0,8,'images/Purina Fancy Feast Gravy Wet Cat Food.jpg'),(19,'Purina ONE Sensitive Skin & Stomach With Real Turkey, Natural Adult Dry Cat Food','Care for your sensitive cat\'s health with Purina ONE Sensitive Skin & Stomach adult dry cat food. This carefully formulated cat food for sensitive stomachs nourishes with a special blend made with nutritious turkey as the #1 ingredient along with other high-quality ingredients. The easily digestible, high protein cat food has 36 grams of protein per cup to help support strong muscles.',4700,10,0,8,'images/Purina ONE Dry Cat Food.jpg'),(20,'Pet Craft Supply Cat Bed for Indoor Cats - Kitten Bed - Machine Washable - Ultra Soft','The simple Sleeper cat bed is the perfect place for lounging or playing. The round contoured shape and soft plush interior Provide ample comfort and support, while the refillable catnip pouch makes this bed a Perfect place for play and fun. Machine washable for easy cleaning. Size: 19\" X 14\" X 5\".',4700,6,0,10,'images/Pet Craft Supply Cat Bed.jpg'),(21,'Cat Pet Bed Cave- Indoor Enclosed Covered Cavern/House for Cats Kittens and Small Pets','The enclosed cat tent is designed to cradle your pet to achieve maximum privacy and soothing security for cats, kittens, or small dogs up to 16-pounds. Made with a velvety material that is soft to the touch and a removable cushioned cat bed, this cat cave delivers enhanced orthopedic luxury and warmth, perfect for aging pets needing joint support as they unwind into a deep sleep.',6900,10,0,10,'images/Cat Pet Bed Cave.jpg'),(22,'Kitty City Large Stackable Grey Condo, Cat Cube, Cat House, Pop Up Bed','Plush pillows for your cat to lounge all day. It\'s just about everything a feline companion could love, all in one place! And the Cat Condo is convenient for you as well - it sets up easily in just a few moments, and folds away flat in the rare moments you want to put it away. Better yet, the two included pillows are easy to wash. Just remove the base support board and throw them in with the laundry.',12600,10,0,10,'images/Kitty City Large Stackable Grey Condo.jpg'),(23,'Kitty City Large Plaid Cat Tunnel Bed, Cat Toy - for Cat and Kitten, Red ','It\'s an all-round HQ for almost everything your cat loves. The tunnel cat bed combines a soft-but-structured tunnel with entry and exit points, a hanging toy to play with and a cozy plush Bed in the middle. It assembles and breaks down in just a few minutes. Zip It down, fold it up, and the whole set is ready to hit the road and entertain your cat wherever you roam. ',8000,10,0,10,'images/Kitty City Large Plaid Cat Tunnel Bed.jpg'),(24,'PetSafe SlimCat Meal-Dispensing Cat Toy, Great for Food or Treats, Blue','The PetSafe SlimCat is a fun, interactive toy that combines playtime with mealtime to help control your cat\'s weight. You can choose to put treats or dry food in the SlimCat. The openings are adjustable so you can tailor the challenge to your cat\'s needs.',2000,10,0,15,'images/Blue Meal-Dispensing Cat Toy.jpg'),(25,'Pet Cat Teaser Toys Feather, Cat Catcher Stick Cat Toys with Mini Bell','Cats Hunting Nature Instinct: Cats like to move things, and especially like to play toys have feathers, aerodynamically configured feathers that mimic the action and of a bird in flight, and our interactive toys engage the pet with you. This activity builds trust and companionship between you and your cats',2400,10,0,15,'images/Pet Cat Teaser Toys.jpg'),(26,'Advantage II Flea Prevention and Treatment for Large Cats, 6 Pack','Advantage II topical flea treatment and prevention for large cats over 9 lbs is a veterinarian-recommended, monthly application that kills fleas through contact, so they don\'t have to bite your cat to die. The protection of Advantage II kills fleas in multiple life stages, including eggs, larvae and adults, effectively breaking the flea life cycle to control existing flea infestations on your cat and prevent further infestations.',3500,10,0,16,'images/Advantage II Cat Health.jpg'),(27,'Elanco Tapeworm Dewormer for Cats and Kittens 6 Weeks and Older','If your cat has had fleas, there\'s a chance they have tapeworms too. Tapeworm segments look similar to grains of white rice and are visible when stuck in your cat\'s hair under the tail or by the back legs or in their poop. It\'s not always obvious that your cat has tapeworms, so the best way to identify a problem is through an exam performed by a veterinarian. Use Bayer Tapeworm Dewormer for Cats to treat your pet.',1200,10,0,16,'images/Elanco Tapeworm Cat Health.jpg'),(28,'Aqueon Standard Glass Rectangle Aquarium (10 GAL)','The standard aquarium is made with care to ensure that it can stand up to almost any application. These aquariums come in a wide range of sizes with black trim styling. Large aquariums feature one piece center-braced frames that eliminate glass bowing. Be sure to place the aquarium on a stand that is able to safely bear the weight of a filled aquarium. Always include a drip loop when plugging aquarium appliances into the electrical outlet.',55000,10,0,18,'images/Aqueon Standard Glass Rectangle Aquarium.jpg'),(29,'Aqueon Aquarium Fish Tank Starter Kit with LED Lighting 20 Gallon High Fish Tank','Aqueon LED boxed fish tank kits offer a complete habitat with vibrant LED lighting to bring the aquarium to life. The energy saving low-profile hood features cool white LEDs for total illumination, a convenient feeding door in the front and breakout sections in the back for popular accessories. Complete with high-quality components needed for a healthy aquatic environment including a heater, QuietFlow LED PRO power filter, fish food, water conditioner, fish net and a stick-on thermometer. ',105000,9,0,18,'images/Aqueon 20-Gallon High Fish Tank.jpg'),(30,'Koller Products 3-Gallon 360 Aquarium with LED Lighting (7 Color Choices)','Koller Products 3-gallon 360 aquarium includes energy-efficient LED lighting with 7 color choices plus 4 transitioning and color combinations you can choose depending on the time of day or to enhance your viewing pleasure, an internal power filter that will keep your aquarium water optimal and fish healthy, full hood to keep your fish secure, and User Set Up Guide for step by step assembly. Dimensions: 10. 25 L x 10. 25 W x 14.5 H Inches.',45000,10,0,18,'images/Koller Products 3-Gallon Tall.jpg'),(31,'Tetra TetraMin Plus Tropical Flakes 7.06 Ounces, Fish Food','Tetra TetraMin Plus Tropical Flakes are a nutritionally balanced, premium, complete diet with added shrimp flakes for maximum flavor in a food for all tropical fish. Specialized, high-protein fish meal makes this Tetra brand\'s most digestible flake food ever. This staple food. Tetra TetraMin Plus Tropical Flakes include the scientifically developed ProCare blend. Feed two to three times daily, only as much as your fish can consume within several minutes.',11000,10,0,17,'images/Tetra TetraMin Fish food.jpg'),(32,'Kaytee Koi\'s Choice Koi Floating Fish Food','Koi\'s Choice Premium Pond formula is a highly digestible, floating food that is suitable for all seasons. It provides necessary animal and vegetable proteins, and essential nutrients required for excellent growth, color, health and longevity. Kaytee Koi\'s Choice formula is nutritionally complete, helps turn your backyard pond into a haven for all of your pond fish. Kaytee\'s Koi\'s Choice is for Koi, Goldfish and other pond fish. Remove uneaten food.',14000,10,0,17,'images/Kaytee Koi\'s Choice Fish food.jpg'),(33,'Aqueon Tropical Flakes 2.29 Ounces','Aqueon Tropical Foods provide optimum nutrition for a wide array of tropical fish. They provide a healthy daily diet for proper growth and vitality and bring out natural colors in fish. Flake food floats at the surface of the water for fish to enjoy. Also available in granules to accommodate the various feeding habits throughout the water column.',3300,10,0,17,'images/Aqueon Tropical Flakes Fish food.jpg'),(34,'CESAR Soft Wet Dog Food Classic Loaf in Sauce Beef Recipe','Dogs with sophisticated palates will enjoy a rich culinary experience with CESAR Canine Cuisine Gourmet Wet Dog Food. With Beef or US Chicken and tail wag. CESAR Canine Cuisine Classic Loaf in Sauce Variety Pack Dog Food, and is enhanced with vitamins and minerals for complete and balanced nutrition.',3000,10,0,1,'images/cesar_front.jpg'),(35,'Petstages Tower of Tracks Interactive 3-Tier Cat Toy','The Petstages Tower of Tracks is sure to have your kitty chasing, swatting, batting and catching the bright-colored balls as they race around the track! The Petstages Tower of Tracks ball track toy has three levels and three balls that spin and roll as your kitty plays. This toy is recommended for cats 12 weeks and older.',3500,10,0,15,'images/Petstages Tower of Tracks Cat Toy.jpg'),(36,'Penn-Plax Spongebob Squarepants Ornament - Spongebob\'s Pineapple House','From the creative minds at Nickelodeon, bring SpongeBob\'s famous pineapple house that\'s located on 124 Conch Street, Bikini Bottom, to your home! This medium sized, officially licensed aquarium ornament from Penn-Plax makes for a great addition to all home aquariums.',12000,10,0,19,'images/Spongebob\'s Pineapple House.jpg'),(37,'CNZ Fish Tank Decoration Artificial Purple Plastic Plant, 16-inch','Provides an excellent hiding place for fish. Anchored with a weighted base, so it will stay where it has been placed in the tank. Provides a beautiful decoration in your aquarium. A wonderful gift choice.',3200,10,0,19,'images/Fish Tank Decoration Plastic Plant.jpg'),(38,'Marineland Bamboo 3 Feet, Décor For aquariums and Terrariums','At Marineland, innovation powers everything we do. From industry firsts to industry standards, Marineland products are designed with both performance and style in mind. Make it Marineland. Creating a beautifully aqua-scaped aquarium is easy with Marineland décor. Decorations allow the aquarium to become a living piece of art, while providing cover for the fish, thus reducing fish stress.',5400,4,0,19,'images/Marineland Bamboo Decoration.jpg'),(39,'Koller Products AquaView 3-Gallon Fish Tank with Power Filter','Koller Products AquaView 3-Gallon Fish Tank includes energy efficient LED lighting with 7 multiple color selections along with additional transitioning and color combinations, brightly illuminating your fish with dazzling colors you can select depending on time of day or night. Imagine sitting in front of this aquarium watching beautiful tropical fish gently swim back and forth.',38000,0,0,18,'images/AquaView 3-Gallon Fish Tank.jpg'),(40,'FEANDREA Cat Tree, Cat Tower for Indoor Cats, Cat Condo, Light Gray','This cat tree is suitable for 4 cats to use, up to 15.4 lb each. If your cat starts to chew or eat the pompom or elastic band, please remove the toys and keep them out of the reach of your cat. If the cat cave is damaged, please repair or replace it in time to avoid the risk of injury due to damaged parts. Attach the product to the wall with the anti-tip kit included for safe use.',98000,7,0,10,'images/FEANDREA Cat Tree.jpg'),(41,'Penn-Plax Wizard\'s Castle Aquarium Decoration with Realistic Details 10 Inches High','The Penn Plax Wizard\'s Castle Aquarium Decoration offers visual interest to your tank. This aquarium decoration serves two purposes, to add visual interest for humans but also acts as a hideaway and passageway for your fish. Aquarium ornament is made of quality resin and hand painted; measuring 7.25 inches across and 10 inches high by 5.5 inches deep.',15000,4,0,19,'images/Penn-Plax Wizard\'s Castle.jpg');
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderdetail` (
  `order_detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `qty` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  PRIMARY KEY (`order_detail_id`),
  UNIQUE KEY `order_detail_id` (`order_detail_id`),
  KEY `order_id` (`order_id`),
  KEY `orderdetail_ibfk_1` (`item_id`),
  CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`) ON DELETE CASCADE,
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
INSERT INTO `orderdetail` VALUES (84,4,51,20),(85,1,51,38),(86,2,52,1),(87,1,52,11),(88,1,52,10),(89,2,53,41),(90,1,54,41),(91,2,54,40),(92,1,55,40),(93,1,55,41),(94,1,56,41),(95,1,56,9);
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `total_qty` int(11) NOT NULL,
  `total_price` int(11) NOT NULL,
  `payment_type` varchar(50) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  `order_date` date NOT NULL,
  `receiver_name` varchar(255) NOT NULL,
  `receiver_phone` varchar(25) NOT NULL,
  `receiver_address` varchar(1000) NOT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id` (`order_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (51,14,5,24200,'K Pay','4 beds for my cats.','Confirm','2022-10-08','Noé Archiviste','09-43434300','Vampire Street, Paris'),(52,14,4,52600,'KBZ Bank Account','2 beds and dog foods for my puppies.','Confirm','2022-10-08','Noé Archiviste','09-43434300','Vampire Street, Paris'),(53,14,2,30000,'Aya Bank Account','','Confirm','2022-10-08','Noé Archiviste','09-43434300','Vampire Street, Paris'),(54,16,3,211000,'CB Bank Account','','Confirm','2022-10-09','ByunBaekHyun','09-8798797987','No. 04, Eri street, Bucheon, South Korea'),(55,16,2,113000,'CB Bank Account','','Processing','2022-10-09','ByunBaekHyun','09-8798797987','No. 04, Eri street, Bucheon, South Korea'),(56,14,2,20400,'KBZ Bank Account','','Processing','2022-10-10','Noé Archiviste','09-43434300','Vampire Street, Paris');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pets`
--

DROP TABLE IF EXISTS `pets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pets` (
  `pet_id` int(11) NOT NULL AUTO_INCREMENT,
  `pet_name` varchar(255) NOT NULL,
  `pet_image` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`pet_id`),
  UNIQUE KEY `pet_id` (`pet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pets`
--

LOCK TABLES `pets` WRITE;
/*!40000 ALTER TABLE `pets` DISABLE KEYS */;
INSERT INTO `pets` VALUES (25,'Dog','images/Happy-Dog334.jpg'),(26,'Cat','images/Pretty-Cat334.jpg'),(35,'Fish','images/Red-Fish334.jpg');
/*!40000 ALTER TABLE `pets` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-10 20:17:23
