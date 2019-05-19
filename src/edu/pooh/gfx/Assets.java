package edu.pooh.gfx;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class Assets {

    // CONSTANTS
    private static final int WIDTH_IN_PIXEL = 16;
    private static final int HEIGHT_IN_PIXEL = 16;

    // FONT
    public static Font font28;

    // START BUTTONS
    public static BufferedImage[] startButtons;

    // INVENTORY
    public static BufferedImage inventoryBackground, dateDisplayerBackground;

    // SELF-CREATED TEXTURE
    public static BufferedImage waterFX;

    // SPANNING SINGLE-TILE (/TILES)
    public static BufferedImage hay, egg, eggFragmented, fence, dirtWalkway, dirtNormal,
            signPostTransparent, berry, rockMountain, flowerYellow, flowerPurple;

    // SPANNING MULTIPLE-TILE (/TILES)
    public static BufferedImage[][] home5x4, cowBarn5x5, silos5x6, chickenCoop4x5, toolShed5x5,
            stable2x3, building2x3, shippingBin2x2, poolWater2x2, poolWater3x3;

    // SINGLE (/ENTITIES)
    public static BufferedImage plantSproutling, plantJuvenille, plantAdult, plantFlowering2, honeyPot,
            plantFlowering1, rock, wood;

    // SPANNING MULTIPLE-TILE (/ENTITIES)
    public static BufferedImage[][] boulder2x2, treeStump2x2;

    // SPANNING MULTIPLE-TILE (DIABLO2-LOD)
    public static BufferedImage deadCowBefore, deadCowAfter;
    public static BufferedImage[] deadCowExplosion;

    // ITEMS (/TOOLS)
    public static BufferedImage wateringCan, scythe, shovel, hammer, axe,
            goldSprinkler, goldScythe, goldShovel, goldAxe, goldHammer;

    // ENTITIES (/CROPS)
    public static BufferedImage dirtTilledDry, dirtTilledWatered,
            dirtSeededDry, dirtSeededWatered,
            secretGardenEmpty, secretGardenFlower,
            turnip0Whole, turnip0Fragmented, turnip1Dry, turnip1Watered, turnip2Dry, turnip2Watered,
            potato0Whole, potato0Fragmented, potato1Dry, potato1Watered, potato2Dry, potato2Watered,
            tomato0Whole, tomato0Fragmented, tomato1Dry, tomato1Watered, tomato2Dry, tomato2Watered,
            tomato3Dry, tomato3Watered, tomato4Dry, tomato4Watered,
            corn0Whole, corn0Fragmented, corn1Dry, corn1Watered, corn2Dry, corn2Watered,
            corn3Dry, corn3Watered, corn4Dry, corn4Watered;

    // ENTITIES (/GRASS and EGG and MILK and POWERBERRY)
    public static BufferedImage grassSeeded, grassYoung, grassAdult,
            grassYoungAutumn, grassAdultAutumn, grassSeededWinter,
            /*egg,*/ milkSmall, milkMedium, milkLarge, powerBerry;

    // ITEMS (/TOOLS)
    public static BufferedImage seedBag;

    // ENTITIES STANDING-STILL (/PLAYER)
    public static BufferedImage playerUpDefault, playerDownDefault, playerLeftDefault, playerRightDefault,
            playerUpLeftDefault, playerUpRightDefault, playerDownLeftDefault, playerDownRightDefault;
    // ENTITIES MOVING/ANIMATED (/PLAYER)
    public static BufferedImage[] playerUp, playerDown, playerLeft, playerRight,
            playerUpLeft, playerUpRight, playerDownLeft, playerDownRight;

    // ENTITIES MOVING/ANIMATED (/HAWKER)
    public static BufferedImage[] hawkerUp, hawkerDown, hawkerLeft, hawkerRight;

    // ENTITIES MOVING/ANIMATED (/KERO DOG, WOLF)
    public static BufferedImage[] xDogUp, xDogDown, xDogLeft, xDogRight, xDogLeftPee;
    public static BufferedImage[] wolfRight, wolfLeft;

    // ENTITIES MOVING/ANIMATED (/DOG, COW, CHICKEN, HORSE, JACK_WALKING, JACK_RUNING)
    public static BufferedImage[] dogUp, dogDown, dogLeft, dogRight,
            cowUp, cowDown, cowLeft, cowRight,
            chickenUp, chickenDown, chickenLeft, chickenRight,
            horseUp, horseDown, horseLeft, horseRight,
            jackWalkingUp, jackWalkingDown, jackWalkingLeft, jackWalkingRight,
            jackRunningUp, jackRunningDown, jackRunningLeft, jackRunningRight;
    public static BufferedImage[] chickUp, chickDown, chickLeft, chickRight;

    // ENTITIES MOVING/ANIMATED (MOLLY [playerFemale])
    public static BufferedImage[] mollyWalkingDown, mollyWalkingLeft, mollyWalkingRight, mollyWalkingUp,
            mollyHoldingDown, mollyHoldingLeft, mollyHoldingRight, mollyHoldingUp,
            mollyTakeDown, mollyTakeLeft, mollyTakeRight, mollyTakeUp,
            mollyPatBrow, mollyPantingSweating, mollyStumble, mollyCollapse,
            mollyEating, mollySeeds,
            mollyRidingHorseDown, mollyRidingHorseLeft, mollyRidingHorseRight, mollyRidingHorseUp,
            mollyMountingHorseDown, mollyMountingHorseLeft, mollyMountingHorseRight, mollyMountingHorseUp;

    // ENTITIES MOVING/ANIMATED (/PIKACHU)
    public static BufferedImage[] pikachuWalkSW, pikachuWalkNW, pikachuWalkNE, pikachuWalkSE,
            pikachuRunSW, pikachuRunNW, pikachuRunNE, pikachuRunSE,
            pikachuAttackRegSW, pikachuAttackRegNW, pikachuAttackRegNE, pikachuAttackRegSE,
            pikachuAttackSpecialSW, pikachuAttackSpecialNW, pikachuAttackSpecialNE, pikachuAttackSpecialSE;

    // TRAVELINGFENCESTATE (STORE/SHOPPING STATE)
    public static BufferedImage shoppingScreen;

    // STATE (HOMESTATE)
    //public static BufferedImage homeStateBackground;
    public static BufferedImage homeStateBackground2, chickenCoopStateBackground, cowBarnStateBackground,
            toolShedStateBackground, crossroadStateBackground, mountainStateBackground;

    // LOADING MAP BY RGB VALUES
    public static BufferedImage tilesGameViaRGB, tilesHomeViaRGB, tilesChickenCoopViaRGB, tilesCowBarnViaRGB,
            tilesToolShedViaRGB, tilesCrossroadViaRGB, tilesMountainViaRGB;
    public static BufferedImage entitiesGameViaRGB, entitiesHomeViaRGB, entitiesChickenCoopViaRGB, entitiesCowBarnViaRGB,
            entitiesToolShedViaRGB, entitiesCrossroadViaRGB , entitiesMountainViaRGB;



/* |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+| */
/* |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+| */
/* |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+| */



    public static void init() {
        // **************************************************************
        // |+|+|+|+|+|+|+| FONT: SLKSCR.TTF (size == 28) |+|+|+|+|+|+|+|
        // **************************************************************
        font28 = FontLoader.loadFont("res/fonts/slkscr.ttf", 28);

        // **************************************************************
        // |+|+|+|+|+|+|+| INVENTORY SCREEN (BACKGROUND) |+|+|+|+|+|+|+|
        // **************************************************************
        inventoryBackground = ImageLoader.loadImage("/InventoryBackground.png");
        dateDisplayerBackground = ImageLoader.loadImage("/DateDisplayerBackground.png");

        // ************************************************************
        // |+|+|+|+|+|+|+| SHOPPING SCREEN (BACKGROUND) |+|+|+|+|+|+|+|
        // ************************************************************
        shoppingScreen = ImageLoader.loadImage("/shady sundial salesman in hercules (TravelingFenceState500x270).jpg");

        // *****************************************************
        // |+|+|+|+|+|+|+| (unused???) WATERITEM |+|+|+|+|+|+|+|
        // *****************************************************
        waterFX = ImageLoader.loadImage("/textures/entities/waterItem.png");

        // ********************************************************
        // |+|+|+|+|+|+|+| MENUSTATE: STARTBUTTONS |+|+|+|+|+|+|+|
        // ********************************************************

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/StartButtons(96x64).png"));
        startButtons = new BufferedImage[2];
        startButtons[0] = sheet.crop(0, 0, 96, 31);
        startButtons[1] = sheet.crop(0, 32, 96, 31);

        // *****************************************************************
        // |+|+|+|+|+|+|+| TILES: SINGLE AND MULTIPLE TILES |+|+|+|+|+|+|+|
        // *****************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles/harvest moon tile sprite sheet.png"));
        hay = sheet.crop(0 * WIDTH_IN_PIXEL, 0 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);

        egg = sheet.crop(0 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        eggFragmented = sheet.crop(0 * WIDTH_IN_PIXEL, 2 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);

        plantSproutling = sheet.crop(0 * WIDTH_IN_PIXEL, 3 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        plantJuvenille = sheet.crop(0 * WIDTH_IN_PIXEL, 4 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        plantAdult = sheet.crop(0 * WIDTH_IN_PIXEL, 5 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);

        plantFlowering1 = sheet.crop(1 * WIDTH_IN_PIXEL, 0 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        plantFlowering2 = sheet.crop(1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        rock = sheet.crop(1 * WIDTH_IN_PIXEL, 2 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        wood = sheet.crop(1 * WIDTH_IN_PIXEL, 3 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        signPostTransparent = sheet.crop(1 * WIDTH_IN_PIXEL, 4 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        fence = sheet.crop(1 * WIDTH_IN_PIXEL, 5 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        dirtWalkway = sheet.crop(0 * WIDTH_IN_PIXEL, 6 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        dirtNormal = sheet.crop(1 * WIDTH_IN_PIXEL, 6 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        berry = sheet.crop(0 * WIDTH_IN_PIXEL, 18 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        rockMountain = sheet.crop(1 * WIDTH_IN_PIXEL, 18 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        flowerYellow = sheet.crop(2 * WIDTH_IN_PIXEL, 18 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);
        flowerPurple = sheet.crop(2 * WIDTH_IN_PIXEL, 19 * HEIGHT_IN_PIXEL,
                1 * WIDTH_IN_PIXEL, 1* HEIGHT_IN_PIXEL);

        home5x4 = new BufferedImage[4][5];
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 5; x++) {
                home5x4[y][x] = sheet.crop((2 + x) * WIDTH_IN_PIXEL,
                        (0 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL,1 * HEIGHT_IN_PIXEL);
            }
        }

        cowBarn5x5 = new BufferedImage[5][5];
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                cowBarn5x5[y][x] = sheet.crop((2 + x) * WIDTH_IN_PIXEL,
                        (4 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        silos5x6 = new BufferedImage[6][5];
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 5; x++) {
                silos5x6[y][x] = sheet.crop((2 + x) * WIDTH_IN_PIXEL,
                        (9 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        chickenCoop4x5 = new BufferedImage[5][4];
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 4; x++) {
                chickenCoop4x5[y][x] = sheet.crop((3 + x) * WIDTH_IN_PIXEL,
                        (15 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        toolShed5x5 = new BufferedImage[5][5];
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                toolShed5x5[y][x] = sheet.crop((2 + x) * WIDTH_IN_PIXEL,
                        (20 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        stable2x3 = new BufferedImage[3][2];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 2; x++) {
                stable2x3[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (19 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        building2x3 = new BufferedImage[3][2];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 2; x++) {
                building2x3[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (22 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        shippingBin2x2 = new BufferedImage[2][2];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 2; x++) {
                shippingBin2x2[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (7 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        boulder2x2 = new BufferedImage[2][2];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 2; x++) {
                boulder2x2[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (9 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        treeStump2x2 = new BufferedImage[2][2];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 2; x++) {
                treeStump2x2[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (11 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        poolWater2x2 = new BufferedImage[2][2];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 2; x++) {
                poolWater2x2[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (13 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        poolWater3x3 = new BufferedImage[3][3];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                poolWater3x3[y][x] = sheet.crop((0 + x) * WIDTH_IN_PIXEL,
                        (15 + y) * HEIGHT_IN_PIXEL, 1 * WIDTH_IN_PIXEL, 1 * HEIGHT_IN_PIXEL);
            }
        }

        // SPANNING MULTIPLE-TILE (DIABLO2-LOD)
        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/PC Computer - Diablo 2 Diablo 2 Lord of Destruction - Dead Cow Container.png"));
        deadCowBefore = sheet.crop(1, 17, 185, 209);
        deadCowAfter = sheet.crop(1, 683, 185, 209);
        deadCowExplosion = new BufferedImage[22];
        int x = 1;
        for (int i = 0; i < 11; i++) {
            deadCowExplosion[i] = sheet.crop(x, 245, 185, 209);
            x += 186;
        }
        x = 1;
        for (int i = 0; i < 11; i++) {
            deadCowExplosion[i] = sheet.crop(x, 455, 185, 209);
            x += 186;
        }

        // ************************************************************
        // |+|+|+|+|+|+|+| ITEM: TOOLS (TIER0 && TIER1 |+|+|+|+|+|+|+|
        // ************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Tools.png"));
        wateringCan = sheet.crop(6, 10, 16, 12);
        scythe = sheet.crop(22, 8, 16, 14);
        shovel = sheet.crop(38, 6, 14, 16);
        hammer = sheet.crop(54, 8, 15, 14);
        axe = sheet.crop(71, 7, 13, 15);
        goldSprinkler = sheet.crop(7, 26, 15, 12);
        goldScythe = sheet.crop(22, 24, 16, 14);
        goldShovel = sheet.crop(39, 22, 13, 16);
        goldAxe = sheet.crop(54, 22, 15, 16);
        goldHammer = sheet.crop(70, 23, 16, 15);

        // ****************************************************************
        // |+|+|+|+|+|+|+| DIRT and CROPS (DRY && WATERED) |+|+|+|+|+|+|+|
        // ****************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Crops.png"));
        dirtTilledDry = sheet.crop(32, 41, 16, 16);
        dirtTilledWatered = sheet.crop(50, 41, 16, 16);
        dirtSeededDry = sheet.crop(99, 41, 16, 16);
        dirtSeededWatered = sheet.crop(117, 41, 16, 16);
        secretGardenEmpty = sheet.crop(171, 41, 16, 16);
        secretGardenFlower = sheet.crop(189, 41, 16, 16);
        turnip0Whole = sheet.crop(13, 171, 16, 16);
        turnip0Fragmented = sheet.crop(31, 171, 16, 16);
        turnip1Dry = sheet.crop(13, 135, 16, 16);
        turnip1Watered = sheet.crop(31, 135, 16, 16);
        turnip2Dry = sheet.crop(13, 153, 16, 16);
        turnip2Watered = sheet.crop(31, 153, 16, 16);
        potato0Whole = sheet.crop(75, 171, 16, 16);
        potato0Fragmented = sheet.crop(93, 171, 16, 16);
        potato1Dry = sheet.crop(75, 135, 16, 16);
        potato1Watered = sheet.crop(93, 135, 16, 16);
        potato2Dry = sheet.crop(75, 153, 16, 16);
        potato2Watered = sheet.crop(93, 153, 16, 16);
        tomato0Whole = sheet.crop(139, 207, 16, 16);
        tomato0Fragmented = sheet.crop(157, 207, 16, 16);
        tomato1Dry = sheet.crop(139, 135, 16, 16);
        tomato1Watered = sheet.crop(157, 135, 16, 16);
        tomato2Dry = sheet.crop(139, 153, 16, 16);
        tomato2Watered = sheet.crop(157, 153, 16, 16);
        tomato3Dry = sheet.crop(139, 171, 16, 16);
        tomato3Watered = sheet.crop(157, 171, 16, 16);
        tomato4Dry = sheet.crop(139, 189, 16, 16);
        tomato4Watered = sheet.crop(157, 189, 16, 16);
        corn0Whole = sheet.crop(202, 207, 16, 16);
        corn0Fragmented = sheet.crop(220, 207, 16, 16);
        corn1Dry = sheet.crop(202, 135, 16, 16);
        corn1Watered = sheet.crop(220, 135, 16, 16);
        corn2Dry = sheet.crop(202, 153, 16, 16);
        corn2Watered = sheet.crop(220, 153, 16, 16);
        corn3Dry = sheet.crop(202, 171, 16, 16);
        corn3Watered = sheet.crop(220, 171, 16, 16);
        corn4Dry = sheet.crop(202, 189, 16, 16);
        corn4Watered = sheet.crop(220, 189, 16, 16);

        // *********************************************************************
        // |+|+|+|+|+|+|+| GRASS and EGG and MILK and POWERBERRY |+|+|+|+|+|+|+|
        // *********************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/Game Boy GBC - Harvest Moon GBC - Crops and Items.png"));
        grassSeeded = sheet.crop(7, 60, 16, 16);
        grassYoung = sheet.crop(24, 60, 16, 16);
        grassAdult = sheet.crop(41, 60, 16, 16);
        grassYoungAutumn = sheet.crop(82, 60, 16, 16);
        grassAdultAutumn = sheet.crop(99, 60, 16, 16);
        grassSeededWinter = sheet.crop(125, 60, 16, 16);

        //egg = sheet.crop(178, 41, 16, 16);

        milkSmall = sheet.crop(178, 60, 16, 16);
        milkMedium = sheet.crop(195, 60, 16, 16);
        milkLarge = sheet.crop(212, 60, 16, 16);

        powerBerry = sheet.crop(178, 117, 16, 16);

        // ***************************************
        // |+|+|+|+|+|+|+| SEEDBAG |+|+|+|+|+|+|+|
        // ***************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/seedBag.png"));
        seedBag = sheet.crop(0, 0, 32, 32);

        // **************************************************************
        // |+|+|+|+|+|+|+| PLAYER MOVEMENTS && HONEY POT |+|+|+|+|+|+|+|
        // **************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/Game Boy Advance - Kingdom Hearts Chain of Memories - Winnie the Pooh.png"));
        honeyPot = sheet.crop(318, 1556, 38, 37);
        playerUpDefault = sheet.crop(314, 1063, 20, 36);
        playerDownDefault = sheet.crop(178, 1061, 20, 38);
        playerLeftDefault = sheet.crop(111, 1062, 17, 37);
        playerRightDefault = sheet.crop(247, 1062, 17, 37);

        playerUpLeftDefault = sheet.crop(349, 1064, 17, 35);
        playerUpRightDefault = sheet.crop(281, 1064, 17, 35);
        playerDownLeftDefault = sheet.crop(145, 1060, 17, 39);
        playerDownRightDefault = sheet.crop(213, 1060, 17, 39);

        playerUp = new BufferedImage[11];
        playerUp[0] = sheet.crop(21, 1163, 27, 39);
        playerUp[1] = sheet.crop(62, 1164, 27, 38);
        playerUp[2] = sheet.crop(102, 1163, 28, 39);
        playerUp[3] = sheet.crop(142, 1162, 28, 40);
        playerUp[4] = sheet.crop(184, 1162, 26, 40);
        playerUp[5] = sheet.crop(229, 1162, 24, 40);
        playerUp[6] = sheet.crop(269, 1164, 26, 38);
        playerUp[7] = sheet.crop(311, 1164, 26, 38);
        playerUp[8] = sheet.crop(348, 1163, 28, 39);
        playerUp[9] = sheet.crop(392, 1163, 27, 39);
        playerUp[10] = sheet.crop(430, 1162, 26, 40);

        playerDown = new BufferedImage[11];
        playerDown[0] = sheet.crop(17, 1114, 26, 36);
        playerDown[1] = sheet.crop(58, 1113, 26, 37);
        playerDown[2] = sheet.crop(99, 1112, 26, 38);
        playerDown[3] = sheet.crop(140, 1114, 26, 36);
        playerDown[4] = sheet.crop(181, 1115, 26, 35);
        playerDown[5] = sheet.crop(224, 1115, 24, 35);
        playerDown[6] = sheet.crop(264, 1113, 26, 37);
        playerDown[7] = sheet.crop(305, 1112, 26, 38);
        playerDown[8] = sheet.crop(350, 1113, 26, 37);
        playerDown[9] = sheet.crop(393, 1115, 26, 35);
        playerDown[10] = sheet.crop(434, 1116, 26, 34);

        playerLeft = new BufferedImage[11];
        playerLeft[0] = sheet.crop(20, 1268, 24, 34);
        playerLeft[1] = sheet.crop(64, 1268, 19, 34);
        playerLeft[2] = sheet.crop(107, 1266, 19, 36);
        playerLeft[3] = sheet.crop(146, 1265, 22, 37);
        playerLeft[4] = sheet.crop(184, 1266, 23, 36);
        playerLeft[5] = sheet.crop(227, 1269, 25, 33);
        playerLeft[6] = sheet.crop(269, 1266, 19, 36);
        playerLeft[7] = sheet.crop(309, 1265, 19, 37);
        playerLeft[8] = sheet.crop(354, 1264, 19, 38);
        playerLeft[9] = sheet.crop(395, 1265, 21, 37);
        playerLeft[10] = sheet.crop(433, 1267, 24, 35);

        playerRight = new BufferedImage[11];
        playerRight[0] = sheet.crop(20, 1217, 24, 34);
        playerRight[1] = sheet.crop(64, 1217, 19, 34);
        playerRight[2] = sheet.crop(107, 1215, 19, 36);
        playerRight[3] = sheet.crop(146, 1214, 22, 37);
        playerRight[4] = sheet.crop(184, 1215, 23, 36);
        playerRight[5] = sheet.crop(227, 1218, 25, 33);
        playerRight[6] = sheet.crop(269, 1215, 19, 36);
        playerRight[7] = sheet.crop(309, 1214, 19, 37);
        playerRight[8] = sheet.crop(354, 1213, 19, 38);
        playerRight[9] = sheet.crop(395, 1214, 21, 37);
        playerRight[10] = sheet.crop(433, 1216, 24, 35);

        playerUpLeft = new BufferedImage[11];
        playerUpLeft[0] = sheet.crop(20, 1493, 22, 36);
        playerUpLeft[1] = sheet.crop(66, 1492, 20, 37);
        playerUpLeft[2] = sheet.crop(108, 1491, 20, 38);
        playerUpLeft[3] = sheet.crop(148, 1492, 19, 37);
        playerUpLeft[4] = sheet.crop(185, 1491, 18, 38);
        playerUpLeft[5] = sheet.crop(226, 1491, 20, 38);
        playerUpLeft[6] = sheet.crop(265, 1490, 24, 39);
        playerUpLeft[7] = sheet.crop(300, 1491, 26, 38);
        playerUpLeft[8] = sheet.crop(347, 1491, 25, 38);
        playerUpLeft[9] = sheet.crop(393, 1492, 24, 37);
        playerUpLeft[10] = sheet.crop(430, 1494, 26, 35);

        playerUpRight = new BufferedImage[11];
        playerUpRight[0] = sheet.crop(20, 1428, 22, 36);
        playerUpRight[1] = sheet.crop(66, 1427, 20, 37);
        playerUpRight[2] = sheet.crop(108, 1426, 20, 38);
        playerUpRight[3] = sheet.crop(148, 1427, 19, 37);
        playerUpRight[4] = sheet.crop(185, 1426, 18, 38);
        playerUpRight[5] = sheet.crop(226, 1426, 20, 38);
        playerUpRight[6] = sheet.crop(265, 1425, 24, 39);
        playerUpRight[7] = sheet.crop(300, 1426, 26, 38);
        playerUpRight[8] = sheet.crop(347, 1426, 25, 38);
        playerUpRight[9] = sheet.crop(393, 1427, 24, 37);
        playerUpRight[10] = sheet.crop(430, 1429, 26, 35);

        playerDownLeft = new BufferedImage[11];
        playerDownLeft[0] = sheet.crop(20, 1375, 24, 33);
        playerDownLeft[1] = sheet.crop(65, 1373, 23, 35);
        playerDownLeft[2] = sheet.crop(108, 1372, 21, 36);
        playerDownLeft[3] = sheet.crop(147, 1373, 20, 37);
        playerDownLeft[4] = sheet.crop(185, 1372, 19, 36);
        playerDownLeft[5] = sheet.crop(228, 1374, 18, 34);
        playerDownLeft[6] = sheet.crop(269, 1376, 19, 32);
        playerDownLeft[7] = sheet.crop(303, 1374, 23, 34);
        playerDownLeft[8] = sheet.crop(349, 1373, 26, 35);
        playerDownLeft[9] = sheet.crop(391, 1373, 27, 35);
        playerDownLeft[10] = sheet.crop(431, 1375, 25, 33);

        playerDownRight = new BufferedImage[11];
        playerDownRight[0] = sheet.crop(15, 1325, 24, 33);
        playerDownRight[1] = sheet.crop(60, 1323, 23, 35);
        playerDownRight[2] = sheet.crop(103, 1322, 21, 36);
        playerDownRight[3] = sheet.crop(148, 1321, 20, 37);
        playerDownRight[4] = sheet.crop(190, 1322, 19, 36);
        playerDownRight[5] = sheet.crop(232, 1324, 18, 34);
        playerDownRight[6] = sheet.crop(274, 1326, 19, 32);
        playerDownRight[7] = sheet.crop(308, 1324, 23, 34);
        playerDownRight[8] = sheet.crop(355, 1323, 26, 35);
        playerDownRight[9] = sheet.crop(397, 1323, 27, 35);
        playerDownRight[10] = sheet.crop(437, 1325, 25, 33);


        // *******************************************
        // |+|+|+|+|+|+|+| ENTITY: DOG |+|+|+|+|+|+|+|
        // *******************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Kero Dog.png"));
        xDogUp = new BufferedImage[5];
        xDogUp[0] = sheet.crop(6, 91, 13, 17);
        xDogUp[1] = sheet.crop(36, 91, 13, 18);
        xDogUp[2] = sheet.crop(66, 91, 13, 18);
        xDogUp[3] = sheet.crop(96, 91, 13, 18);
        xDogUp[4] = sheet.crop(126, 91, 13, 18);

        xDogDown = new BufferedImage[5];
        xDogDown[0] = sheet.crop(5, 61, 15, 17);
        xDogDown[1] = sheet.crop(37, 61, 12, 17);
        xDogDown[2] = sheet.crop(65, 62, 15, 15);
        xDogDown[3] = sheet.crop(95, 63, 15, 14);
        xDogDown[4] = sheet.crop(126, 62, 13, 16);

        xDogLeft = new BufferedImage[5];
        xDogLeft[0] = sheet.crop(3, 3, 20, 13);
        xDogLeft[1] = sheet.crop(30, 1, 25, 17);
        xDogLeft[2] = sheet.crop(63, 3, 20, 13);
        xDogLeft[3] = sheet.crop(93, 2, 20, 15);
        xDogLeft[4] = sheet.crop(123, 0, 19, 20);

        xDogLeftPee = new BufferedImage[5];
        xDogLeftPee[0] = sheet.crop(6, 33, 19, 14);
        xDogLeftPee[1] = sheet.crop(34, 33, 18, 14);
        xDogLeftPee[2] = sheet.crop(63, 32, 18, 15);
        xDogLeftPee[3] = sheet.crop(92, 33, 20, 14);
        xDogLeftPee[4] = sheet.crop(120, 32, 25, 15);

        xDogRight = new BufferedImage[5];
        xDogRight[0] = flipHorizontally( sheet.crop(3, 3, 20, 13) );
        xDogRight[1] = flipHorizontally( sheet.crop(30, 1, 25, 17) );
        xDogRight[2] = flipHorizontally( sheet.crop(63, 3, 20, 13) );
        xDogRight[3] = flipHorizontally( sheet.crop(93, 2, 20, 15) );
        xDogRight[4] = flipHorizontally( sheet.crop(123, 0, 19, 20) );

        /*
        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Kero Dog (right).png"));
        xDogRight = new BufferedImage[5];
        xDogRight[0] = sheet.crop(390, 3, 20, 13);
        xDogRight[1] = sheet.crop(358, 1, 25, 17);
        xDogRight[2] = sheet.crop(330, 3, 20, 13);
        xDogRight[3] = sheet.crop(300, 2, 20, 15);
        xDogRight[4] = sheet.crop(271, 0, 19, 20);
        */


        // *******************************************
        // |+|+|+|+|+|+|+| ENTITY: WOLF |+|+|+|+|+|+|+|
        // *******************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Small Animals.png"));
        wolfRight = new BufferedImage[3];
        wolfRight[0] = sheet.crop(0, 0, 23, 14);
        wolfRight[1] = sheet.crop(29, 0, 23, 14);
        wolfRight[2] = sheet.crop(60, 0, 23, 14);

        wolfLeft = new BufferedImage[3];
        wolfLeft[0] = flipHorizontally( sheet.crop(0, 0, 23, 14) );
        wolfLeft[1] = flipHorizontally( sheet.crop(29, 0, 23, 14) );
        wolfLeft[2] = flipHorizontally( sheet.crop(60, 0, 23, 14) );


        // ********************************************************************************************
        // |+|+|+|+|+|+|+| ENTITY: DOG, COW, CHICKEN, HORSE, JACK_WALKING, JACK_RUNNING |+|+|+|+|+|+|+|
        // ********************************************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Creatures.png"));
        dogUp = new BufferedImage[3];
        dogUp[0] = sheet.crop(6, 141, 13, 18);
        dogUp[1] = sheet.crop(30, 142, 13, 17);
        dogUp[2] = sheet.crop(54, 141, 13, 18);

        dogDown = new BufferedImage[3];
        dogDown[0] = sheet.crop(6, 204, 13, 19);
        dogDown[1] = sheet.crop(30, 205, 13, 18);
        dogDown[2] = sheet.crop(54, 204, 13, 19);

        dogLeft = new BufferedImage[3];
        dogLeft[0] = sheet.crop(3, 242, 19, 13);
        dogLeft[1] = sheet.crop(27, 242, 19, 13);
        dogLeft[2] = sheet.crop(51, 242, 19, 13);

        dogRight = new BufferedImage[3];
        dogRight[0] = sheet.crop(3, 178, 19, 13);
        dogRight[1] = sheet.crop(27, 178, 19, 13);
        dogRight[2] = sheet.crop(51, 178, 19, 13);


        cowUp = new BufferedImage[3];
        cowUp[0] = sheet.crop(77, 139, 15, 21);
        cowUp[1] = sheet.crop(101, 139, 15, 21);
        cowUp[2] = sheet.crop(125, 139, 15, 21);

        cowDown = new BufferedImage[3];
        cowDown[0] = sheet.crop(77, 205, 15, 19);
        cowDown[1] = sheet.crop(101, 205, 15, 19);
        cowDown[2] = sheet.crop(125, 205, 15, 19);

        cowLeft = new BufferedImage[3];
        cowLeft[0] = sheet.crop(74, 240, 21, 15);
        cowLeft[1] = sheet.crop(98, 239, 21, 16);
        cowLeft[2] = sheet.crop(122, 240, 21, 15);

        cowRight = new BufferedImage[3];
        cowRight[0] = sheet.crop(74, 176, 21, 15);
        cowRight[1] = sheet.crop(98, 175, 21, 16);
        cowRight[2] = sheet.crop(122, 176, 21, 15);


        chickenUp = new BufferedImage[3];
        chickenUp[0] = sheet.crop(147, 144, 16, 16);
        chickenUp[1] = sheet.crop(172, 145, 14, 15);
        chickenUp[2] = sheet.crop(195, 144, 16, 16);

        chickenDown = new BufferedImage[3];
        chickenDown[0] = sheet.crop(147, 207, 16, 16);
        chickenDown[1] = sheet.crop(171, 208, 16, 15);
        chickenDown[2] = sheet.crop(195, 207, 16, 16);

        chickenLeft = new BufferedImage[3];
        chickenLeft[0] = sheet.crop(147, 239, 16, 16);
        chickenLeft[1] = sheet.crop(171, 240, 16, 15);
        chickenLeft[2] = sheet.crop(195, 239, 16, 16);

        chickenRight = new BufferedImage[3];
        chickenRight[0] = sheet.crop(147, 175, 16, 16);
        chickenRight[1] = sheet.crop(171, 176, 16, 15);
        chickenRight[2] = sheet.crop(195, 175, 16, 16);


        horseUp = new BufferedImage[3];
        horseUp[0] = sheet.crop(222, 137, 12, 22);
        horseUp[1] = sheet.crop(246, 137, 12, 22);
        horseUp[2] = sheet.crop(270, 137, 12, 22);

        horseDown = new BufferedImage[3];
        horseDown[0] = sheet.crop(222, 204, 12, 19);
        horseDown[1] = sheet.crop(246, 204, 12, 19);
        horseDown[2] = sheet.crop(270, 204, 12, 19);

        horseLeft = new BufferedImage[3];
        horseLeft[0] = sheet.crop(216, 237, 24, 18);
        horseLeft[1] = sheet.crop(240, 235, 24, 20);
        horseLeft[2] = sheet.crop(264, 237, 24, 18);

        horseRight = new BufferedImage[3];
        horseRight[0] = sheet.crop(216, 173, 24, 18);
        horseRight[1] = sheet.crop(240, 171, 24, 20);
        horseRight[2] = sheet.crop(264, 173, 24, 18);


        jackWalkingUp = new BufferedImage[3];
        jackWalkingUp[0] = sheet.crop(76, 7, 16, 24);
        jackWalkingUp[1] = sheet.crop(100, 8, 16, 23);
        jackWalkingUp[2] = sheet.crop(124, 7, 16, 24);

        jackWalkingDown = new BufferedImage[3];
        jackWalkingDown[0] = sheet.crop(76, 71, 16, 24);
        jackWalkingDown[1] = sheet.crop(100, 72, 16, 23);
        jackWalkingDown[2] = sheet.crop(124, 71, 16, 24);

        jackWalkingLeft = new BufferedImage[3];
        jackWalkingLeft[0] = sheet.crop(76, 103, 16, 24);
        jackWalkingLeft[1] = sheet.crop(100, 104, 16, 23);
        jackWalkingLeft[2] = sheet.crop(124, 103, 16, 24);

        jackWalkingRight = new BufferedImage[3];
        jackWalkingRight[0] = sheet.crop(76, 39, 16, 24);
        jackWalkingRight[1] = sheet.crop(100, 40, 16, 23);
        jackWalkingRight[2] = sheet.crop(124, 39, 16, 24);


        jackRunningUp = new BufferedImage[3];
        jackRunningUp[0] = sheet.crop(148, 5, 16, 26);
        jackRunningUp[1] = sheet.crop(172, 8, 16, 23);
        jackRunningUp[2] = sheet.crop(196, 5, 16, 26);

        jackRunningDown = new BufferedImage[3];
        jackRunningDown[0] = sheet.crop(149, 70, 15, 25);
        jackRunningDown[1] = sheet.crop(172, 72, 16, 23);
        jackRunningDown[2] = sheet.crop(197, 70, 15, 25);

        jackRunningLeft = new BufferedImage[3];
        jackRunningLeft[0] = sheet.crop(148, 102, 16, 25);
        jackRunningLeft[1] = sheet.crop(172, 104, 16, 23);
        jackRunningLeft[2] = sheet.crop(196, 102, 16, 25);

        jackRunningRight = new BufferedImage[3];
        jackRunningRight[0] = sheet.crop(148, 38, 16, 25);
        jackRunningRight[1] = sheet.crop(172, 40, 16, 23);
        jackRunningRight[2] = sheet.crop(196, 38, 16, 25);



        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Chicken.png"));
        chickDown = new BufferedImage[2];
        chickDown[0] = sheet.crop(270, 0, 16, 16);
        chickDown[1] = sheet.crop(270, 30, 16, 16);

        chickUp = new BufferedImage[2];
        chickUp[0] = sheet.crop(300, 0, 12, 16);
        chickUp[1] = sheet.crop(300, 30, 12, 16);

        chickLeft = new BufferedImage[2];
        chickLeft[0] = sheet.crop(240, 0, 16, 16);
        chickLeft[1] = sheet.crop(240, 30, 16, 16);

        chickRight = new BufferedImage[2];
        chickRight[0] = flipHorizontally( sheet.crop(240, 0, 16, 16) );
        chickRight[1] = flipHorizontally( sheet.crop(240, 30, 16, 16) );


        // ************************************************************
        // |+|+|+|+|+|+|+| ENTITY: MOLLY (playerFemale) |+|+|+|+|+|+|+|
        // ************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/DS DSi - Harvest Moon DS Cute - Farmer Ponytails.png"));
        mollyWalkingDown = new BufferedImage[6];
        mollyWalkingDown[0] = sheet.crop(5, 28, 19, 30);
        mollyWalkingDown[1] = sheet.crop(34, 29, 18, 29);
        mollyWalkingDown[2] = sheet.crop(62, 29, 18, 29);
        mollyWalkingDown[3] = sheet.crop(89, 29, 19, 29);
        mollyWalkingDown[4] = sheet.crop(116, 31, 19, 27);
        mollyWalkingDown[5] = sheet.crop(146, 31, 19, 27);

        mollyWalkingLeft = new BufferedImage[6];
        mollyWalkingLeft[0] = sheet.crop(5, 64, 18, 30);
        mollyWalkingLeft[1] = sheet.crop(34, 65, 19, 29);
        mollyWalkingLeft[2] = sheet.crop(61, 65, 20, 29);
        mollyWalkingLeft[3] = sheet.crop(89, 64, 18, 30);
        mollyWalkingLeft[4] = sheet.crop(116, 67, 21, 27);
        mollyWalkingLeft[5] = sheet.crop(146, 67, 21, 27);

        mollyWalkingRight = new BufferedImage[6];
        mollyWalkingRight[0] = flipHorizontally( sheet.crop(5, 64, 18, 30) );
        mollyWalkingRight[1] = flipHorizontally( sheet.crop(34, 65, 19, 29) );
        mollyWalkingRight[2] = flipHorizontally( sheet.crop(61, 65, 20, 29) );
        mollyWalkingRight[3] = flipHorizontally( sheet.crop(89, 64, 18, 30) );
        mollyWalkingRight[4] = flipHorizontally( sheet.crop(116, 67, 21, 27) );
        mollyWalkingRight[5] = flipHorizontally( sheet.crop(146, 67, 21, 27) );

        mollyWalkingUp = new BufferedImage[6];
        mollyWalkingUp[0] = sheet.crop(4, 101, 19, 30);
        mollyWalkingUp[1] = sheet.crop(33, 102, 18, 29);
        mollyWalkingUp[2] = sheet.crop(60, 102, 18, 29);
        mollyWalkingUp[3] = sheet.crop(88, 102, 19, 29);
        mollyWalkingUp[4] = sheet.crop(117, 104, 19, 29);
        mollyWalkingUp[5] = sheet.crop(147, 104, 19, 29);

        mollyHoldingDown = new BufferedImage[3];
        mollyHoldingDown[0] = sheet.crop(3, 169, 19, 30);
        mollyHoldingDown[1] = sheet.crop(34, 170, 19, 29);
        mollyHoldingDown[2] = sheet.crop(62, 170, 19, 29);

        mollyHoldingLeft = new BufferedImage[3];
        mollyHoldingLeft[0] = sheet.crop(4, 206, 18, 30);
        mollyHoldingLeft[1] = sheet.crop(33, 208, 20, 28);
        mollyHoldingLeft[2] = sheet.crop(61, 209, 20, 27);

        mollyHoldingRight = new BufferedImage[3];
        mollyHoldingRight[0] = flipHorizontally( sheet.crop(4, 206, 18, 30) );
        mollyHoldingRight[1] = flipHorizontally( sheet.crop(33, 208, 20, 28) );
        mollyHoldingRight[2] = flipHorizontally( sheet.crop(61, 209, 20, 27) );

        mollyHoldingUp = new BufferedImage[3];
        mollyHoldingUp[0] = sheet.crop(2, 247, 21, 30);
        mollyHoldingUp[1] = sheet.crop(32, 251, 21, 28);
        mollyHoldingUp[2] = sheet.crop(60, 251, 21, 28);

        mollyTakeDown = new BufferedImage[3];
        mollyTakeDown[0] = sheet.crop(96, 173, 21, 26);
        mollyTakeDown[1] = sheet.crop(126, 170, 19, 29);
        mollyTakeDown[2] = sheet.crop(155, 170, 19, 29);

        mollyTakeLeft = new BufferedImage[3];
        mollyTakeLeft[0] = sheet.crop(93, 207, 21, 29);
        mollyTakeLeft[1] = sheet.crop(126, 208, 19, 28);
        mollyTakeLeft[2] = sheet.crop(155, 208, 19, 28);

        mollyTakeRight = new BufferedImage[3];
        mollyTakeRight[0] = flipHorizontally( sheet.crop(93, 207, 21, 29) );
        mollyTakeRight[1] = flipHorizontally( sheet.crop(126, 208, 19, 28) );
        mollyTakeRight[2] = flipHorizontally( sheet.crop(155, 208, 19, 28) );

        mollyTakeUp = new BufferedImage[3];
        mollyTakeUp[0] = sheet.crop(95, 250, 21, 27);
        mollyTakeUp[1] = sheet.crop(125, 248, 19, 29);
        mollyTakeUp[2] = sheet.crop(155, 248, 19, 29);

        mollyPatBrow = new BufferedImage[4];
        mollyPatBrow[0] = sheet.crop(191, 170, 18, 29);
        mollyPatBrow[1] = sheet.crop(214, 169, 21, 30);
        mollyPatBrow[2] = sheet.crop(238, 169, 18, 30);
        mollyPatBrow[3] = sheet.crop(260, 169, 18, 30);

        mollyPantingSweating = new BufferedImage[7];
        mollyPantingSweating[0] = sheet.crop(282, 170, 23, 30);
        mollyPantingSweating[1] = sheet.crop(308, 170, 19, 30);
        mollyPantingSweating[2] = sheet.crop(331, 174, 19, 26);
        mollyPantingSweating[3] = sheet.crop(355, 173, 19, 27);
        mollyPantingSweating[4] = sheet.crop(379, 177, 21, 23);
        mollyPantingSweating[5] = sheet.crop(404, 176, 21, 24);
        mollyPantingSweating[6] = sheet.crop(429, 175, 20, 26);

        mollyStumble = new BufferedImage[8];
        mollyStumble[0] = sheet.crop(190, 206, 20, 29);
        mollyStumble[1] = sheet.crop(214, 206, 19, 29);
        mollyStumble[2] = sheet.crop(238, 206, 19, 29);
        mollyStumble[3] = sheet.crop(260, 208, 19, 27);
        mollyStumble[4] = sheet.crop(283, 212, 21, 23);
        mollyStumble[5] = sheet.crop(307, 212, 19, 23);
        mollyStumble[6] = sheet.crop(330, 211, 20, 23);
        mollyStumble[7] = sheet.crop(355, 212, 20, 23);

        mollyCollapse = new BufferedImage[4];
        mollyCollapse[0] = sheet.crop(380, 212, 24, 30);
        mollyCollapse[1] = sheet.crop(408, 212, 21, 31);
        mollyCollapse[2] = sheet.crop(435, 219, 18, 24);
        mollyCollapse[3] = sheet.crop(460, 226, 19, 17);

        mollyEating = new BufferedImage[2];
        mollyEating[0] = sheet.crop(526, 101, 16, 30);
        mollyEating[1] = sheet.crop(561, 101, 17, 30);


        mollySeeds = new BufferedImage[3];
        mollySeeds[0] = sheet.crop(347, 277, 22, 29);
        mollySeeds[1] = sheet.crop(381, 275, 22, 31);
        mollySeeds[2] = sheet.crop(415, 276, 22, 30);


        mollyRidingHorseDown = new BufferedImage[6];
        mollyRidingHorseDown[0] = sheet.crop(8, 315, 20, 40);
        mollyRidingHorseDown[1] = sheet.crop(41, 316, 20, 39);
        mollyRidingHorseDown[2] = sheet.crop(75, 316, 20, 39);
        mollyRidingHorseDown[3] = sheet.crop(108, 318, 22, 37);
        mollyRidingHorseDown[4] = sheet.crop(140, 317, 20, 38);
        mollyRidingHorseDown[5] = sheet.crop(171, 319, 24, 38);

        mollyRidingHorseLeft = new BufferedImage[6];
        mollyRidingHorseLeft[0] = sheet.crop(3, 368, 32, 40);
        mollyRidingHorseLeft[1] = sheet.crop(43, 368, 32, 39);
        mollyRidingHorseLeft[2] = sheet.crop(85, 367, 31, 39);
        mollyRidingHorseLeft[3] = sheet.crop(124, 368, 34, 38);
        mollyRidingHorseLeft[4] = sheet.crop(163, 368, 34, 38);
        mollyRidingHorseLeft[5] = sheet.crop(204, 370, 32, 36);

        mollyRidingHorseRight = new BufferedImage[6];
        mollyRidingHorseRight[0] = flipHorizontally( sheet.crop(3, 368, 32, 40) );
        mollyRidingHorseRight[1] = flipHorizontally( sheet.crop(43, 368, 32, 39) );
        mollyRidingHorseRight[2] = flipHorizontally( sheet.crop(85, 367, 31, 39) );
        mollyRidingHorseRight[3] = flipHorizontally( sheet.crop(124, 368, 34, 38) );
        mollyRidingHorseRight[4] = flipHorizontally( sheet.crop(163, 368, 34, 38) );
        mollyRidingHorseRight[5] = flipHorizontally( sheet.crop(204, 370, 32, 36) );

        mollyRidingHorseUp = new BufferedImage[6];
        mollyRidingHorseUp[0] = sheet.crop(8, 419, 20, 42);
        mollyRidingHorseUp[1] = sheet.crop(42, 420, 20, 41);
        mollyRidingHorseUp[2] = sheet.crop(75, 419, 20, 41);
        mollyRidingHorseUp[3] = sheet.crop(105, 421, 25, 40);
        mollyRidingHorseUp[4] = sheet.crop(140, 420, 22, 40);
        mollyRidingHorseUp[5] = sheet.crop(173, 418, 20, 41);

        mollyMountingHorseDown = new BufferedImage[1];
        mollyMountingHorseDown[0] = sheet.crop(500, 174, 21, 26);

        mollyMountingHorseLeft = new BufferedImage[2];
        mollyMountingHorseLeft[0] = flipHorizontally( sheet.crop(501, 213, 20, 28) );
        mollyMountingHorseLeft[1] = flipHorizontally( sheet.crop(538, 208, 24, 31) );

        mollyMountingHorseRight = new BufferedImage[2];
        mollyMountingHorseRight[0] = sheet.crop(501, 213, 20, 28);
        mollyMountingHorseRight[1] = sheet.crop(538, 208, 24, 31);

        mollyMountingHorseUp = new BufferedImage[2];
        mollyMountingHorseUp[0] = sheet.crop(504, 253, 16, 26);
        mollyMountingHorseUp[1] = sheet.crop(540, 255, 20, 23);


        // ***********************************************
        // |+|+|+|+|+|+|+| ENTITY: PIAKCHU |+|+|+|+|+|+|+|
        // ***********************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/DS DSi - Pokemon Ranger 3 Guardian Signs - Pikachu & Raichu.png"));

        pikachuWalkSW = new BufferedImage[3];
        pikachuWalkSW[0] = sheet.crop(18, 26, 24, 22);
        pikachuWalkSW[1] = sheet.crop(42, 26, 24, 22);
        pikachuWalkSW[2] = sheet.crop(66, 26, 24, 22);

        pikachuWalkNW = new BufferedImage[3];
        pikachuWalkNW[0] = sheet.crop(16, 52, 24, 22);
        pikachuWalkNW[1] = sheet.crop(40, 52, 24, 22);
        pikachuWalkNW[2] = sheet.crop(64, 52, 24, 22);

        pikachuWalkNE = new BufferedImage[3];
        pikachuWalkNE[0] = sheet.crop(13, 77, 24, 22);
        pikachuWalkNE[1] = sheet.crop(37, 77, 24, 22);
        pikachuWalkNE[2] = sheet.crop(61, 77, 24, 22);

        pikachuWalkSE = new BufferedImage[3];
        pikachuWalkSE[0] = sheet.crop(13, 102, 24, 22);
        pikachuWalkSE[1] = sheet.crop(37, 102, 24, 22);
        pikachuWalkSE[2] = sheet.crop(61, 102, 24, 22);


        pikachuRunSW = new BufferedImage[3];
        pikachuRunSW[0] = sheet.crop(105, 10, 32, 32);
        pikachuRunSW[1] = sheet.crop(137, 10, 32, 32);
        pikachuRunSW[2] = sheet.crop(169, 10, 32, 32);

        pikachuRunNW = new BufferedImage[3];
        pikachuRunNW[0] = sheet.crop(105, 45, 32, 32);
        pikachuRunNW[1] = sheet.crop(137, 45, 32, 32);
        pikachuRunNW[2] = sheet.crop(169, 45, 32, 32);

        pikachuRunNE = new BufferedImage[3];
        pikachuRunNE[0] = sheet.crop(102, 76, 32, 32);
        pikachuRunNE[1] = sheet.crop(134, 76, 32, 32);
        pikachuRunNE[2] = sheet.crop(166, 76, 32, 32);

        pikachuRunSE = new BufferedImage[3];
        pikachuRunSE[0] = sheet.crop(102, 108, 32, 32);
        pikachuRunSE[1] = sheet.crop(134, 108, 32, 32);
        pikachuRunSE[2] = sheet.crop(166, 108, 32, 32);


        pikachuAttackRegSW = new BufferedImage[3];
        pikachuAttackRegSW[0] = sheet.crop(225, 9, 24, 32);
        pikachuAttackRegSW[1] = sheet.crop(249, 9, 24, 32);

        pikachuAttackRegNW = new BufferedImage[3];
        pikachuAttackRegNW[0] = sheet.crop(225, 45, 24, 32);
        pikachuAttackRegNW[1] = sheet.crop(249, 45, 24, 32);

        pikachuAttackRegNE = new BufferedImage[3];
        pikachuAttackRegNE[0] = sheet.crop(221, 78, 24, 32);
        pikachuAttackRegNE[1] = sheet.crop(249, 77, 24, 32);

        pikachuAttackRegSE = new BufferedImage[3];
        pikachuAttackRegSE[0] = sheet.crop(223, 109, 24, 32);
        pikachuAttackRegSE[1] = sheet.crop(251, 109, 24, 32);


        pikachuAttackSpecialSW = new BufferedImage[3];
        pikachuAttackSpecialSW[0] = sheet.crop(301, 11, 24, 32);
        pikachuAttackSpecialSW[1] = sheet.crop(336, 10, 24, 32 );
        pikachuAttackSpecialSW[2] = sheet.crop(369, 9, 24, 32);

        pikachuAttackSpecialNW = new BufferedImage[3];
        pikachuAttackSpecialNW[0] = sheet.crop(302, 47, 24, 30);
        pikachuAttackSpecialNW[1] = sheet.crop(340, 47, 24, 30);
        pikachuAttackSpecialNW[2] = sheet.crop(373, 47, 24, 30);

        pikachuAttackSpecialNE = new BufferedImage[3];
        pikachuAttackSpecialNE[0] = sheet.crop(301, 81, 24, 29);
        pikachuAttackSpecialNE[1] = sheet.crop(330, 81, 24, 29);
        pikachuAttackSpecialNE[2] = sheet.crop(363, 81, 24, 29);

        pikachuAttackSpecialSE = new BufferedImage[3];
        pikachuAttackSpecialSE[0] = sheet.crop(305, 114, 21, 32);
        pikachuAttackSpecialSE[1] = sheet.crop(336, 114, 21, 32);
        pikachuAttackSpecialSE[2] = sheet.crop(369, 114, 21, 32);


        // ***********************************************************************************
        // |+|+|+|+|+|+|+| ENTITY: TRAVELINGFENCE (name == The Finn) (HAWKER) |+|+|+|+|+|+|+|
        // ***********************************************************************************

        sheet = new SpriteSheet(ImageLoader.loadImage("/textures/entities/SNES - Harvest Moon - Hawker and Peddler.png"));
        hawkerUp = new BufferedImage[3];
        hawkerUp[0] = sheet.crop(12, 39, 19, 25);
        hawkerUp[1] = sheet.crop(44, 39, 19, 24);
        hawkerUp[2] = sheet.crop(76, 39, 19, 25);

        hawkerDown = new BufferedImage[3];
        hawkerDown[0] = sheet.crop(12, 6, 19, 26);
        hawkerDown[1] = sheet.crop(44, 6, 19, 25);
        hawkerDown[2] = sheet.crop(75, 6, 19, 26);

        hawkerLeft = new BufferedImage[3];
        hawkerLeft[0] = sheet.crop(8, 70, 28, 26);
        hawkerLeft[1] = sheet.crop(40, 70, 27, 25);
        hawkerLeft[2] = sheet.crop(72, 70, 28, 26);

        hawkerRight = new BufferedImage[3];
        hawkerRight[0] = sheet.crop(6, 102, 28, 26);
        hawkerRight[1] = sheet.crop(39, 102, 27, 25);
        hawkerRight[2] = sheet.crop(70, 102, 28, 26);


        // ************************************************************
        // |+|+|+|+|+|+|+| STATE (HOMESTATE BACKGROUND) |+|+|+|+|+|+|+|
        // ************************************************************

        //homeStateBackground = ImageLoader.loadImage("/worlds/Game Boy GBC - Harvest Moon GBC - Home Background.png");
        homeStateBackground2 = ImageLoader.loadImage("/worlds/HomeState background2.png");
        chickenCoopStateBackground = ImageLoader.loadImage("/worlds/ChickenCoopState background.jpg");
        cowBarnStateBackground = ImageLoader.loadImage("/worlds/CowBarnState background.jpg");
        toolShedStateBackground = ImageLoader.loadImage("/worlds/ToolShedState background.png");
        crossroadStateBackground = ImageLoader.loadImage("/worlds/CrossroadState background.png");
        mountainStateBackground = ImageLoader.loadImage("/worlds/MountainState background (no entities).png");
        //mountainStateBackground = ImageLoader.loadImage("/worlds/MountainState background (entities as tiles).png");


        // **********************************************************************
        // |+|+|+|+|+|+|+| LOAD MAP/LEVEL VIA IMAGE (RGB/PIXELS) |+|+|+|+|+|+|+|
        // **********************************************************************

        tilesGameViaRGB = ImageLoader.loadImage("/worlds/chapter1 tiles (rgb).png");
        tilesHomeViaRGB = ImageLoader.loadImage("/worlds/HomeState tiles (rgb).png");
        tilesChickenCoopViaRGB = ImageLoader.loadImage("/worlds/ChickenCoopState tiles (rgb).png");
        tilesCowBarnViaRGB = ImageLoader.loadImage("/worlds/CowBarnState tiles (rgb).png");
        tilesToolShedViaRGB = ImageLoader.loadImage("/worlds/ToolShedState tiles (rgb).png");
        tilesCrossroadViaRGB = ImageLoader.loadImage("/worlds/CrossroadState tiles (rgb).png");
        tilesMountainViaRGB = ImageLoader.loadImage("/worlds/MountainState tiles (rgb).png");
        entitiesGameViaRGB = ImageLoader.loadImage("/worlds/chapter1 entities (rgb).png");
        entitiesHomeViaRGB = ImageLoader.loadImage("/worlds/HomeState entities (rgb).png");
        entitiesChickenCoopViaRGB = ImageLoader.loadImage("/worlds/ChickenCoopState entities (rgb).png");
        entitiesCowBarnViaRGB = ImageLoader.loadImage("/worlds/CowBarnState entities (rgb).png");
        entitiesToolShedViaRGB = ImageLoader.loadImage("/worlds/ToolShedState entities (rgb).png");
        entitiesCrossroadViaRGB = ImageLoader.loadImage("/worlds/CrossroadState entities (rgb).png");
        entitiesMountainViaRGB = ImageLoader.loadImage("/worlds/MountainState entities (rgb).png");

    }

    public static BufferedImage flipHorizontally(BufferedImage image) {
        //BufferedImage returner = new BufferedImage(image.getWidth(null),
        //        image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        //Graphics gReturner = returner.getGraphics();
        //gReturner.drawImage(image, 0, 0, null);
        //gReturner.dispose();

        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-image.getWidth(null), 0);

        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);

        return op.filter(image, null);
    }

} // **** end Assets class ****