CREATE TABLE [dbo].[employee](
	[employeeId] [bigint] NOT NULL,
	[advanceStatuatoryBonus] [bigint] NULL,
	[address] [varchar](255) NULL,
	[basic] [bigint] NULL,
	[conveyanceAllowance] [bigint] NULL,
	[houseRentalAllowance] [bigint] NULL,
	[medicalAllowance] [bigint] NULL,
	[name] [varchar](255) NULL,
	[specialAllowance] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[employeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

