INSERT INTO tender (title, description, creation_date, closing_date, status)
VALUES (
    'Road Construction Project',
    'Building a highway between City A and City B',
    NOW(),
    '2023-12-31 23:59:59',
    'OPEN'
);

INSERT INTO bid (tender_id, bidder_name, amount, submission_date)
VALUES (
    1,
    'ABC Constructions',
    500000.00,
    NOW()
);
-- Insert sample Tenders (furniture selling opportunities)
INSERT INTO tender (title, description, creation_date, closing_date, status) VALUES
('Office Chair Bulk Sale', 'Selling 100 premium ergonomic office chairs', NOW(), '2023-12-31 23:59:59', 'OPEN'),
('Wooden Dining Table Auction', 'High-quality oak dining tables (50 units available)', NOW(), '2023-11-30 18:00:00', 'OPEN'),
('Luxury Sofa Clearance', 'Limited stock of designer sofas at discounted rates', NOW(), '2024-01-15 17:00:00', 'OPEN');

-- Insert sample Bids (buyer offers)
INSERT INTO bid (tender_id, bidder_name, amount, submission_date) VALUES
(1, 'Furniture World Inc.', 12000.00, NOW()),
(1, 'Office Solutions Ltd.', 11500.00, NOW()),
(2, 'Home Decor LLC', 25000.00, NOW()),
(2, 'WoodCraft Enterprises', 27000.00, NOW()),
(3, 'Luxury Living Spaces', 18000.00, NOW());

{
    "bidderName": "Global Furniture Traders",
    "amount": 12500.00
}